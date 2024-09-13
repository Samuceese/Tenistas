package tenista.errors

sealed class TenistaError(message: String) {
    class TenistaErrorValida(message: String) : TenistaError(message)
}