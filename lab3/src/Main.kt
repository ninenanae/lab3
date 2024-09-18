fun main()
{
    println("ЗАДАНИЕ 1")
    print("Введите первое число: ")
    val число1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val число2 = readLine()!!.toInt()
    print("Введите третье число: ")
    val число3 = readLine()!!.toInt()
    var максимальное = число1
    if (число2 > максимальное)
    {
        максимальное = число2
    }
    if (число3 > максимальное)
    {
        максимальное = число3
    }
    println("Максимальное число: $максимальное")

    println("\nЗАДАНИЕ 2")
    print("Введите первое число: ")
    val число4 = readLine()!!.toInt()
    print("Введите второе число: ")
    val число5 = readLine()!!.toInt()
    print("Введите третье число: ")
    val число6 = readLine()!!.toInt()
    if (число4 == число5 || число4 == число6 || число5 == число6)
    {
        println("Ошибка: Среди чисел есть равные.")
    } else
    {
        val среднее = (число4 + число5 + число6) / 3.0
        println("Среднее значение: $среднее")
    }

    println("\nЗАДАНИЕ 3")
    print("Введите первое число: ")
    val число7 = readLine()!!.toInt()
    print("Введите второе число: ")
    val число8 = readLine()!!.toInt()
    if (число7 % 2 != 0 && число8 % 2 == 0)
    {
        println("Нечетное число: $число7")
    } else if (число7 % 2 == 0 && число8 % 2 != 0)
    {
        println("Нечетное число: $число8")
    } else
    {
        println("Ошибка: Оба числа должны иметь разную четность.")
    }

    println("\nЗАДАНИЕ 4")
    print("Введите большее число: ")
    val большееЧисло = readLine()!!.toInt()
    print("Введите меньшее число: ")
    val меньшееЧисло = readLine()!!.toInt()
    if (большееЧисло % меньшееЧисло == 0) {
        println("$большееЧисло кратно $меньшееЧисло")
    } else
    {
        val остаток = большееЧисло % меньшееЧисло
        println("$большееЧисло не кратно $меньшееЧисло")
        println("Остаток от деления: $остаток")
    }

    println("\nЗАДАНИЕ 5")
    print("Введите длину первой стороны: ")
    val сторона1 = readLine()!!.toDouble()
    print("Введите длину второй стороны: ")
    val сторона2 = readLine()!!.toDouble()
    print("Введите длину третьей стороны: ")
    val сторона3 = readLine()!!.toDouble()
    if (сторона1 + сторона2 > сторона3 &&
        сторона1 + сторона3 > сторона2 &&
        сторона2 + сторона3 > сторона1)
    {
        println("Треугольник с такими сторонами может существовать.")
    } else
    {
        println("Треугольник с такими сторонами не может существовать.")
    }

    println("\nЗАДАНИЕ 6")
    print("Введите год: ")
    val год = readLine()!!.toInt()
        println("$год - не високосный год.")
        println("Количество дней в году: 365")

    println("\nЗАДАНИЕ 7")
    print("Введите первое число: ")
    val num1 = readLine()!!.toDouble()
    print("Введите второе число: ")
    val num2 = readLine()!!.toDouble()

    if (num1 > num2) {
        println("$num1 больше, чем $num2")
        println("$num2 меньше, чем $num1")
    } else if (num2 > num1) {
        println("$num2 больше, чем $num1")
        println("$num1 меньше, чем $num2")
    } else {
        println("Числа равны")
    }

    println("\nЗАДАНИЕ 8")
    print("Введите расстояние в километрах: ")
    val kilometers = readLine()!!.toDouble()
    print("Введите расстояние в футах: ")
    val feet = readLine()!!.toDouble()
    val meters = feet * 0.305
    if (kilometers * 1000 > meters) {
        println("Расстояние в футах меньше")
    } else if (kilometers * 1000 < meters) {
        println("Расстояние в километрах меньше")
    } else {
        println("Расстояния равны")
    }

    println("\nЗАДАНИЕ 9")
    print("Введите целое число m: ")
    val m = readLine()!!.toInt()
    print("Введите целое число n: ")
    val n = readLine()!!.toInt()
    if (m % n == 0) {
        println("Частное от деления: ${m / n}")
    } else {
        println("m на n нацело не делится")
    }

    println("\nЗАДАНИЕ 10")
    print("Введите число a: ")
    val a0 = readLine()!!.toInt()
    print("Введите число b: ")
    val b0 = readLine()!!.toInt()
    if (b0 % a0 == 0) {
        println("$a0 является делителем $b0")
    } else {
        println("$a0 не является делителем $b0")
    }

    println("\nЗАДАНИЕ 11")
    print("Введите натуральное число: ")
    val number = readLine()!!.toInt()
    if (number % 2 == 0) {
        println("$number является четным")
    } else {
        println("$number не является четным")
    }
    if (number % 10 == 7) {
        println("$number оканчивается цифрой 7")
    } else {
        println("$number не оканчивается цифрой 7")
    }

    println("\nЗАДАНИЕ 12")
    print("Введите двузначное число: ")
    val number0 = readLine()!!.toInt()
    val firstDigit = number0 / 10
    val secondDigit = number0 % 10
    if (firstDigit > secondDigit) {
        println("Первая цифра больше")
    } else if (secondDigit > firstDigit) {
        println("Вторая цифра больше")
    } else {
        println("Цифры одинаковы")
    }
    println("\nЗАДАНИЕ 13")
    print("Введите четырехзначное число: ")
    val number1 = readLine()!!.toInt()
    val digit1 = number1 / 1000
    val digit2 = (number1 % 1000) / 100
    val digit3 = (number1 % 100) / 10
    val digit4 = number1 % 10
    val sumFirstTwo = digit1 + digit2
    val sumLastTwo = digit3 + digit4
    if (sumFirstTwo == sumLastTwo) {
        println("Сумма первых двух цифр равна сумме последних двух цифр")
    } else {
        println("Сумма первых двух цифр не равна сумме последних двух цифр")
    }
    val sumAllDigits = digit1 + digit2 + digit3 + digit4
    if (sumAllDigits % 3 == 0) {
        println("Сумма цифр кратна трем")
    } else {
        println("Сумма цифр не кратна трем")
    }
    val productAllDigits = digit1 * digit2 * digit3 * digit4
    if (productAllDigits % 4 == 0) {
        println("Произведение цифр кратно четырем")
    } else {
        println("Произведение цифр не кратно четырем")
    }
    print("Введите число a: ")
    val a = readLine()!!.toInt()
    if (productAllDigits % a == 0) {
        println("Произведение цифр кратно $a")
    } else {
        println("Произведение цифр не кратно $a")
    }
















}










