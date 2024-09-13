import org.lighthousegames.logging.logging
import java.io.File

private val logger = logging()

fun main(args:Array<String>){

    if (args.size < 1 || args.size > 2) {
        println("Uso: java -jar torneo_tenis.jar <fichero_entrada.csv> [<fichero_salida.xxx>]")
        return
    }

    val ficheroEntrada = args[0]
    val ficheroSalida = if (args.size == 2) args[1] else "salida.json"



    try {
        val contenidoEntrada = File(ficheroEntrada).readText()
        logger.debug { "El archivo de entrada se ha leido correctamente" }
    }
    catch (e:Exception){
        logger.error { "Error al procesar los archivos ${e.message}" }
    }
}

