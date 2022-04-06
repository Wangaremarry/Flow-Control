fun main() {
    oddNumber()
    println(arrayOfName(arrayOf("Mellisa", "Josphine", "Wanjiru","Jane","Mary")))
    robot(4)
    robot(15)
    robot(18)
    Numbers()
}
fun oddNumber(){
    for (number in 1..100)
    {
        if(number%2 !==0)
            println(number)
    }
}
fun arrayOfName(people:Array<String>):Int {
    var name=0
    people.forEach{ names ->
        if (names.length > 5){
            name++
        }
    }
    return name
}
fun robot(age:Int){
    if( age<=6 ) {
        println("Milk")
    }
    else if(age<=15 && age>=6){
        println("Fanta Orange")
    }
    else if(age>=15){
        println("Coca cola")
    }
}
fun Numbers() {
    for (nums in 1..100) {
        if (nums % 3 == 0) {
            println("Fizz")
        } else if (nums % 5 == 0) {
            println("Buzz")
        }
        if (nums % 3 == 0 && nums % 5 == 0) {
            println("FizzBuzz")
        }
    }
}



