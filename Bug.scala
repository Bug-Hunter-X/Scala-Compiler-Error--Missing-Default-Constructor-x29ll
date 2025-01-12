```scala
class MyClass(val x: Int) {
  def this() = this(0) 
}

val obj = new MyClass()
println(obj.x) //Prints 0

val obj2 = new MyClass(5)
println(obj2.x) //Prints 5

// Problem:
// If you remove the default constructor, this will cause compilation errors
// class MyClass(val x: Int)
// val obj = new MyClass() //Compilation Error: constructor MyClass needs to be defined
// However, if you remove the main constructor
// class MyClass {
//    def this(x:Int) = this()
// }
// val obj = new MyClass(5) // Compilation Error: constructor MyClass needs to be defined
// There is no error when main constructor is not present but default is present, and there are no errors if the secondary constructor is the main one. 
```