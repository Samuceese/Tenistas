package tenista.mapper

import database.TenistaEntity
import locale.returnDateTimeString
import locale.returnLocalDateTimeString
import org.lighthousegames.logging.logging
import tenista.models.Tenista

private val logger = logging()

fun TenistaEntity.toTenista(): Tenista{
    logger.debug { "Mapeando TenistaEntity a Tenista" }
    return Tenista(
        id = this.id.toLong(),
        nombre = this.nombre,
        pais = this.pais,
        altura = this.altura.toInt(),
        peso = this.peso.toInt(),
        puntos = this.puntos.toInt(),
        mano = this.mano,
        fecha_nacimiento = this.fecha_nacimiento.returnDateTimeString(),
        created_at = this.created_at.returnLocalDateTimeString(),
        updated_at = this.updated_at.returnLocalDateTimeString()
    )
}