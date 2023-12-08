package tour.controlflow

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    print(1..4)
    print(1..<4) // seems to be experimental? needs annotation
    print('a'..'d')
}