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
    val created_at: LocalDateTime? = null,
    val updated_at: LocalDateTime? = null
){

    override fun toString(): String {
        return "Tenista(id=$id, nombre='$nombre', pais='$pais', altura=$altura, peso=$peso, puntos=$puntos, mano='$mano', fecha_nacimiento=$fecha_nacimiento, created_at=$created_at, updated_at=$updated_at)"
    }
}