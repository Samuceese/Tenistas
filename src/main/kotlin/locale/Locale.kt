package locale

import java.time.LocalDate
import java.time.LocalDateTime

fun String.returnDateTimeString(): LocalDate {
    val cadena=this.split("-")
    return LocalDate.of(cadena[0].toInt(),cadena[1].toInt(),cadena[2].toInt())
}


fun String.returnLocalDateTimeString(): LocalDateTime {
    val cadena = this.split("-")
    return LocalDateTime.of(cadena[0].toInt(), cadena[1].toInt(), cadena[2].toInt(), 0, 0, 0)
}