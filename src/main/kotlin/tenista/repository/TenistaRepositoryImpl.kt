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
        db.selectAllTenista().executeAsList().map { it.toTenista() }
    }

    override fun getById(id: Int): Tenista? {
        TODO("Not yet implemented")
    }

    override fun save(tenista: Tenista): Tenista {
        TODO("Not yet implemented")
    }

    override fun update(id: Int, tenista: Tenista): Tenista? {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Int): Tenista? {
        TODO("Not yet implemented")
    }

}