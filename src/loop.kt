fun main() {
    println("Начинаем ритуал защиты!")
    repeat(times = 5) { index ->
        if (index == 2) {
            println("Пропускаем шаг ${index + 1} из-за магического вмешательства!")
            return@repeat
        }
        println("Заклинание защиты активировано! (Шаг ${index + 1})")
    }


    val months = listOf("Python","Kotlin","C#","C++","Java")
    println(months[0])
    println(months.size)
    println("Kotlin" in months)

    val daysInMonths = listOf(31,28,31,30,31,30,31,31,30,31,30,31)
    print("ВВедите номер месяца (1-12): ")
    val input = readln().toInt()
    if (input in 1..12){
        val days = daysInMonths[input-1]
        println("В том месяцке $days дней")
    }
    else {
        println("Некоректный месчяц")
    }




    val lowerCase: Char = 'a'
    val upperCase: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'

    val ch = '\u0040'
    println(ch)

    val ch = 'a'
    println(ch.code)
    val num = 97
    println(num.toChar())

    val ch: Char = readln().first()

    val ch = 'a'
    val ch1 = 1 + ch
    val charsSum = 'a' + 'b'
    var ch = 'A'
    ch += 10
    println(ch)
    println(++ch)
    println(++ch)
    println(--ch)
    println('a' < 'c')
    println('x' >= 'z')
    println('D' == 'D')
    println('Q' != 'q')
    println('A' < 'a')

    val one = '1'
    val isdig = one.isDigit()
    val isleter = one.isLetter()
    val capital = 'A'
    val small = 'e'
    val isLetterordigit = capital.isLetterOrDigit()
    val isuppercase = capital.isUpperCase()
    val islowecase = capital.isLowerCase()
    val capitallestring = small.uppercase()
    val capitale = small.uppercaseChar()


}