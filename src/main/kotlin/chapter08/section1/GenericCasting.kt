package chapter08.section1

open class Parent

class Child: Parent()

class Cup<T>

fun main() {
    var obj1: Parent = Child()
//    var obj2 : Child = Parent()

//    var obj3: Cup<Parent> = Cup<Child>()
//    var obj4: Cup<Child> = Cup<Parent>()

    var obj5 = Cup<Child>()
    var obj6: Cup<Child> = obj5

}