fun main() {
//    print("Первое число: ")
//    val num1 = readln().toInt()
//    print("Второе число: ")
//    val num2 = readln().toInt()
//    if (num1 > num2) {
//        println("Число $num1 biggest $num2")
//    } else {
//        println("Integer $num2 biggest $num1")
//    }
//    val max = if (num1 > num2) num1 else num2
//    println("max $max")
//    val age = readln().toInt()
//    val status = if (age >= 18) "Взрослый" else "ребенок"
//    println(status)
//

//    print("Урон: ")
//    val ur = readln().toInt()
//    print("Щит активен да|нет: ")
//    val sh = readln()
//    val res = if (sh == "да") ur/2 else ur
//    println(res)


//    print("ВВедите ваш уровень: ")
//    val level = readln().toInt()
//    print("У вас есть вип статус(true/false): ")
//    val hasVIP = readln().toBoolean()
//    if ((level >= 30 && hasVIP)|| level >=50){
//        println("Доступ разрешен!")
//    }
//    else {
//        println("Доступ запрещен") }
//
//
//    val numbers = 1..100
//    val symbol = 'a' .. 'z'
//

//    print("ВВедите ваш уровень: ")
//    val level = readln().toInt()
//    if (level in 1..50){
//        println("Уровень $level соответсвует требованиям! Вы можете зайти в данж!")
//    }
//    else{
//        println("высокий уровень!")
//    }

//    val a = 'z'..'a'
//    val b = 5..10
//    val c = 10..50 step 3


//    val months = listOf("Python","Kotlin","C#","C++","Java")
//    println(months[0])
//    println(months.size)
//    println("Kotlin" in months)

//    val daysInMonth = listOf(31,28,31,30,31,30,31,31,30,31,30,31)
//    print("Введите порядковый номер месяца(1-12): ")
//    val input = readln().toInt()
//    if (input in 1..12){
//        val days = daysInMonth[input-1]
//        println("В этом месяце $days")
//    }
//    else{
//        println("Wrong")
//    }

//    val ch = 'a'
//    println(ch.code)
//    val num = 97
//    println(num.toChar())
//    val ch: Char = readln().first()


    //1
//    print("ВВедите ваш уровень: ")
//    val level = readln().toInt()
//    if (level < 10){
//        println("Новичек! вы получаете 10 хп")
//    }
//    else if(level in 10..49){
//        println("Опытный! вы получаете 30 хп")
//    }
//    else{
//        println("Легенда! вы получаете 100 хп")
//    }

    //2
//    print("Введите ваш возраст: ")
//    val age = readln().toInt()
//
//    if (age < 12) {
//        println("Вы ребёнок")
//    } else if (age in 12..17) {
//        println("Вы подросток")
//    } else {
//        println("Вы взрослый")

    //3
//    print("Введите число от 1 до 100: ")
//    val number = readln().toInt()
//
//    if (number in 10..50) {
//        println("Число входит в диапазон от 10 до 50")
//    } else {
//        println("Число НЕ входит в диапазон от 10 до 50")
//    }

    //4
//    print("Введите один символ: ")
//    val char = readln().first()
//    when (char){
//        in '0'..'9'->println("Integer")
//        in 'a'..'z' ->println("Bukva")
//        in 'A'..'Z' -> println("Bukva")
//        ' ' -> println("Probel")
//        else -> println("spec")
//    }

    //5
//    var a = 1
//    repeat(10){
//        println("5 * ${a} = ${5*a}")
//        a++
//    }

    //6
//    val a = listOf("Война миров", "Опенгеймер", "1+1", "Бойцовский клуб", "Гнев человеческий")
//
//    for (i in 0 until a.size) {
//        println(a[i])
//        println(a[i].length)
//    }

    //7
//    print("Введите ваше имя: ")
//    val name = readln()
//
//    print("Введите ваш возраст: ")
//    val age = readln().toInt()
//
//    print("Введите ваш любимый цвет: ")
//    val color = readln()
//
//    println("Привет, $name! Тебе $age год(а), и ты любишь $color.")
}
