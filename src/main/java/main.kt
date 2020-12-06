fun main(){
    val amount = 40000
    val coef = 0.075
    val comm = amount * coef
    if(comm<= 3500){
        val minComm = 3500
        println("Ваша комиссия: $minComm")
    } else {
        println("Ваша комиссия: $comm")
    }
}

