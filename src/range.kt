fun main(){
    val numbers = 1..100
    val symbol = 'a' .. 'z'


    print("ВВедите ваш уровень: ")
    val level = readln().toInt()
    if (level in 1..50){
        println("Уровень $level соответсвует требованиям! Вы можете зайти в данж!")
    }
    else{
        println("высокий уровень!")
    }

    val a = 'z'..'a'
    val b = 5..10
    val c = 10..50 step 3
}