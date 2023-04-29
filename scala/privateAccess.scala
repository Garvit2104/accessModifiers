object privateAccess extends App{
//  When a member is declared as private, we can only use it inside the class or through one of its objects.

  var obj1 = new securityNumber
  var obj2 = new otherDetail
  obj1.display()
  obj2.display1()
}
class securityNumber{
  private val number: Int = 12345

  def display(): Unit = {
    println("security key is :"+number)

  }
}
class otherDetail extends securityNumber {
  val age:Int = 23
  val name : String = "Garvit"
  def display1(): Unit = {
    //    println("security key is :"+number)  cannot call here
    println("age of a person is :"+age)
    println("name on the card is :"+name)

  }
}
