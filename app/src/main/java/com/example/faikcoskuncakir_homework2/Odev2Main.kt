package com.example.faikcoskuncakir_homework2

fun main() {

    val odev2 = Odev2()

    // Question 1
    val celsius = 25.0
    val fahrenheit = odev2.celsiusToFahrenheit(celsius)
    println("$celsius Celsius, $fahrenheit Fahrenheit'a eşittir.")

    // Question 2
    val length = 4.5
    val width = 3.2
    val perimeter = odev2.calculateRectanglePerimeter(length, width)
    println("Dikdörtgenin çevresi: $perimeter birim.")

    // Question 3
    val number = 5
    val factorial = odev2.calculateFactorial(number)
    println("$number sayısının faktöriyeli: $factorial")

    // Question 4
    val word = "Ankara"
    val count = odev2.countLetterA(word)
    println("Kelimenin içinde $count adet 'a' harfi bulunuyor.")

    // Question 5
    val numSides = 5
    val angleSum = odev2.calculateInteriorAngleSum(numSides)
    println("$numSides kenarlı çokgenin iç açılarının toplamı: $angleSum derece")

    // Question 6
    val dayCount = 21
    val totalPay = odev2.calculateSalary(dayCount)
    println("Çalışılan gün sayısına göre maaş: $totalPay TL")

    // Question 7
    val usage = 70
    val totalFee = odev2.calculateUsageFee(usage)
    println("Kota kullanımına göre ücret: $totalFee TL")

}