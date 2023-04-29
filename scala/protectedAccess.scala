object protectedAccess extends App{

// They can be only accessible from sub classes of the base class in which the member has been defined.
  var obj1 = new smartPhone
  obj1.display()
  var obj2 = new newSmartPhone
  obj2.display1()
}
class smartPhone{
  protected var brand : String = "Samsung"
  def display(): Unit = {
    println(brand)
  }
}
class newSmartPhone extends smartPhone{
  def display1(): Unit = {
     brand = "Apple"
    println(brand)
  }

}
