import scala.collection.immutable.HashMap

object Menu {

  def items(): HashMap[String, MenuItem] = {
    val cola = MenuItem("Cola", false, false, 50)
    val coffee = MenuItem("Coffee", true, false, 100)
    val cheeseSandwich = MenuItem("Cheese Sandwich", false, true, 200)
    val steakSandwich = MenuItem("Steak Sandwich", true, true, 450)

    HashMap(cola.name -> cola, coffee.name -> coffee, cheeseSandwich.name -> cheeseSandwich, steakSandwich.name -> steakSandwich)
  }

}
