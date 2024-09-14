import org.lighthousegames.logging.logging
import validator.TenistaValidator

private val logger = logging()

fun main(args:Array<String>){

    val validator = TenistaValidator()
    validator.validarCsv(args)


}

