package tenista.storages

import com.github.michaelbull.result.Result
import org.lighthousegames.logging.logging
import tenista.errors.TenistaError
import tenista.models.Tenista
import java.io.File

private val logger = logging()

class StorageCsv : leerFichero , escribirFichero {
    override fun leer(file: File): Result<List<Tenista>, TenistaError> {
        TODO("Not yet implemented")
    }

    override fun escribir(file: File, listTenistas: List<Tenista>): Result<List<Unit>, TenistaError> {
        TODO("Not yet implemented")
    }

}