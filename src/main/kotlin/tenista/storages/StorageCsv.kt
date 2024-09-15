package tenista.storages

import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import com.opencsv.CSVReader
import locale.returnDateTimeString
import locale.returnLocalDateTimeString
import org.lighthousegames.logging.logging
import tenista.errors.TenistaError
import tenista.models.Tenista
import java.io.File
import java.io.FileReader


private val logger = logging()

class StorageCsv : leerFichero , escribirFichero {

    override fun leer(file: File): Result<List<Tenista>, TenistaError> {
        logger.debug { "Leyendo fichero $file" }
        return try {
            CSVReader(FileReader(file)).use { csvReader ->
                val tenistas = csvReader.readAll().drop(1).mapNotNull { it ->
                    if (it.size < 10) {
                        logger.error { "Línea con número incorrecto de columnas: ${it.joinToString(",")}" }
                        null
                    } else {
                        Tenista(
                            id = it[0].toLong(),
                            nombre = it[1],
                            pais = it[2],
                            altura = it[3].toInt(),
                            peso = it[4].toInt(),
                            puntos = it[5].toInt(),
                            mano = it[6],
                            fecha_nacimiento = it[7].returnDateTimeString()
                        )
                    }
                }
                Ok(tenistas)
            }
        } catch (e: Exception) {
            logger.error { "Error al leer el fichero $file: ${e.message}" }
            Err(TenistaError.FileError("Error al leer el fichero $file: ${e.message}"))
        }
    }


    override fun escribir(file: File, listTenistas: List<Tenista>): Result<List<Unit>, TenistaError> {
        TODO("Not yet implemented")
    }

}