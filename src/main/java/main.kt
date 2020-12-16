fun main() {
    val amount = 40000
    val coef = 0.075
    var comm = amount * coef
    if (comm <= 3500) {
        comm = 3500.0
    }
    println("Ваша комиссия: $comm")
}