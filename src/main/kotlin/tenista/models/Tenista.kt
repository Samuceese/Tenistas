package tenista.models

import java.time.LocalDate
import java.time.LocalDateTime

data class Tenista(
    val id: Long = -1,
    val nombre: String,
    val pais: String,
    val altura: Int,
    val peso: Int,
    val puntos: Int,
    val mano: String,
    val fecha_nacimiento: LocalDate,
    val created_at: LocalDateTime,
    val updated_at: LocalDateTime,
)