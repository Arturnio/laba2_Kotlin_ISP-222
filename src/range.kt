fun main() {
    val num = 1 .. 100
    val symb = 'a' .. 'z'
    println("Введите ваш уровень")
    val lvl = readln(). toInt()
    if (lvl in 1 .. 50){
        println("Уровень $lvl соответсвуте требованиям  вы можете зайти в дырку!")
    }
    else{
        println("Высокий уровень ! Вход запрещен !")
    }
    val  s = 'z' downTo 'a'
    val n = 5 .. 10
    val z = 10 .. 50 step 3
}