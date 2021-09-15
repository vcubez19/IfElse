fun main() {


    while (true) {
        println("Enter a temperature.")

        val temperature = readLine()!!.toFloat()
        if (temperature < 97.5) {
            println("$temperature is low!")
        } else if (temperature in 97.5..99.5) {
            println("$temperature is normal!")
        } else {
            println("$temperature is high!")
        }
    }


}
