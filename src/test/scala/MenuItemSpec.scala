import org.scalatest.{FlatSpec, Matchers}

class MenuItemSpec extends FlatSpec with Matchers {

  "A new menu item" should "contain the correct name" in {
    val menuItem = MenuItem("Cola", false, 50)

    menuItem.name should be ("Cola")
  }

  "A hot menu item" should "be hot" in {
    val menuItem = MenuItem("Coffee", true, 100)

    menuItem.hot should be (true)
  }

  "A cold menu item" should "be cold" in {
    val menuItem = MenuItem("Cola", false, 50)

    menuItem.hot should be (false)
  }

  "A menu item" should "have the correct price" in {
    val menuItem = MenuItem("Cola", false, 50)

    menuItem.price should be (50)
  }

}

