fun main() {
    val scores = arrayOf(3, 4, 3, 5) // массив баллов
    val average = scores.average() // вычисление среднего значения
    println("Средний балл по профильному предмету: %.2f".format(average))
}