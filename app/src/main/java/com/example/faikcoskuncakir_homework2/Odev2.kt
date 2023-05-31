package com.example.faikcoskuncakir_homework2

class Odev2 {

    fun celsiusToFahrenheit(degrees: Double): Double {
        val fahrenheit = degrees * 9 / 5 + 32
        return fahrenheit
    }

    fun calculateRectanglePerimeter(length: Double, width: Double): Double {
        val perimeter = 2 * (length + width)
        return perimeter
    }

    fun calculateFactorial(number: Int): Long {
        var factorial: Long = 1
        for (i in 1..number) {
            factorial *= i.toLong()
        }
        return factorial
    }

    fun countLetterA(word: String): Int {
        var count = 0
        for (char in word) {
            if (char == 'a' || char == 'A') {
                count++
            }
        }
        return count
    }

    fun calculateInteriorAngleSum(numSides: Int): Int {
        val angleSum = (numSides - 2) * 180
        return angleSum
    }

    fun calculateSalary(dayCount: Int): Int {
        val dailyHourLimit = 8
        val hourlyRate = 10
        val overtimeRate = 20

        val totalHours = dayCount * dailyHourLimit
        val regularPay = totalHours * hourlyRate

        val overtimeHours = totalHours - 160
        val overtimePay = if (overtimeHours > 0) overtimeHours * overtimeRate else 0

        val totalPay = regularPay + overtimePay
        return totalPay
    }

    fun calculateUsageFee(usage: Int): Int {
        val baseFee = 100
        val perGBFee = 4
        val baseUsage = 50

        val excessUsage = if (usage > baseUsage) usage - baseUsage else 0
        val excessFee = excessUsage * perGBFee

        val totalFee = baseFee + excessFee
        return totalFee
    }

}