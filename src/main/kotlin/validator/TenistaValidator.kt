package validator

import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import org.lighthousegames.logging.logging
import tenista.errors.TenistaError
import tenista.models.Tenista
import java.io.File

private val logger = logging()

class TenistaValidator {

    fun validarCsv(args: Array<String>): Boolean {
        if (args.size !in 1..2) {
            logger.error { "Número de argumentos incorrecto. Se espera 1 o 2 argumentos." }
            return false
        }

        val archivoEntrada = args[0]

        if (!archivoEntrada.endsWith(".csv")) {
            logger.error { "El archivo de entrada no tiene el formato .csv." }
            return false
        }

        return true
    }

}