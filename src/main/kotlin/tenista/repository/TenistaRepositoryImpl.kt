package tenista.repository

import database.SqlDelightManager
import org.lighthousegames.logging.logging
import tenista.mapper.toTenista
import tenista.models.Tenista

private val logger = logging()

class TenistaRepositoryImpl(
    private val dbManager: SqlDelightManager
) : TenistaRepository {

    private val db= dbManager.databaseQueries

    override fun getAll(): List<Tenista> {
        logger.debug { "Obteniendo todos los tenistas" }
        val lista= mutableListOf<Tenista>()
        db.selectAllTenista().executeAsList().map { it.toTenista() }.forEach{lista.add(it)}
        return lista
    }

    override fun getById(id: Int): Tenista? {
        logger.debug { "Obteniendo tenista con id $id" }
        db.selectTenistaByid(id.toLong()).executeAsList().map { it.toTenista() }
        return null
    }

    override fun save(tenista: Tenista): Tenista {
        logger.debug { "Guardando tenista" }
        return db.insertTenista(tenista.nombre,tenista.pais,tenista.altura.toLong(),tenista.peso.toLong(),tenista.puntos.toLong(),tenista.mano,tenista.fecha_nacimiento,tenista.created_at,tenista.updated_at)
    }

    override fun update(id: Int, tenista: Tenista): Tenista? {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Int): Tenista? {
        TODO("Not yet implemented")
    }

}