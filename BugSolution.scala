```scala
//Solution: Always define the main constructor. Auxiliary constructors only extends the main constructor
class MyClass(val x: Int) {
  def this(y: String) = this(y.length) //Auxiliary Constructor
}

val obj = new MyClass(5)
println(obj.x) //Prints 5

val obj2 = new MyClass("hello")
println(obj2.x) //Prints 5

//The auxiliary constructor extends the main constructor. If the main constructor is removed, it will always throw an error.
```