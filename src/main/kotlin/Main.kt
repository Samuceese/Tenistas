import cache.CacheTenistasImpl
import config.Config
import database.SqlDelightManager
import org.lighthousegames.logging.logging
import tenista.repositories.TenistaRepositoryImpl
import tenista.services.TenistaServiceImpl
import tenista.storages.StorageCsv
import kotlin.io.path.Path

private val logger = logging()

fun main(args:Array<String>){

    val servicio = TenistaServiceImpl(
        TenistaRepositoryImpl(SqlDelightManager(Config)),
        CacheTenistasImpl(5),
        StorageCsv()
    )

    //val validator = TenistaValidator()
    //validator.validarCsv(args)


    val filePersonasCsv = Path("src","main","resources","data.csv").toFile()
    servicio.leer(filePersonasCsv)

    val tenistas = servicio.getAll()
}

