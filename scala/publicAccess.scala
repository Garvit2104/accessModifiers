object publicAccess extends App{
// Anyone can access from anywhere and we do not need to define it,
  val obj1 = new other
  obj1.display()
}

class info {
  var age: Int = 23
  var name: String = "Garvit"
}
class other extends info{
  def display(): Unit = {
    println(age)
    println(name)

  }
}