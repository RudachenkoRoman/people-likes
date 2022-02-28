package ru.netology

fun main() {
    println("Введите количество лайков")
    var likes = readLine()!!.toInt()
    var remainderOne = likes % 10
    var remainderEleven = likes % 100
    if (likes > 0) {
        if (remainderOne == 1 && remainderEleven !== 11) {
            println("Понравилось $likes человеку.")
        } else {
            println("Понравилось $likes людям.")
        }
    } else {
        println("Количество лайков должно быть больше 0")
    }
}

