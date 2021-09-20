import kotlin.random.Random

fun main() {
    val random_number = Random.nextInt(11)
    var number1 = 0
    var number2 = 0

    try {
        print("Enter your first number: ")
        number1 = readLine()!!.toInt()

        print("Enter your second number:  ")
        number2 = readLine()!!.toInt()

    } catch (e: Exception){
        println("Please enter numbers only")
    }

    val result = number1 * random_number + number2
    print("$number1 * X + $number2 = $result\n")

    print("What is X? >> ")
    val guss = readLine()!!.toInt()

    if (guss == random_number)
        println("You got it!")
    else
        println("You lose :(")
}

