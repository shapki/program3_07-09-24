fun main() {
    // Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.
    
    val inputVal = readln().toIntOrNull() ?: 0

    if (inputVal <= 0) {
        println("Некорректное число.")
    } else {
        var number = inputVal
        var binaryString = ""
        while (number > 0) {
            binaryString = (number % 2).toString() + binaryString
            number /= 2
        }
        println(binaryString)
    }
}