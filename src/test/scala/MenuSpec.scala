import org.scalatest.{FlatSpec, Matchers}

class MenuSpec extends FlatSpec with Matchers {

  "A menu" should "contain Cola" in {
    val items = Menu.items()

    items("Cola") should be (MenuItem("Cola", false, false, 50))
  }

  "A menu" should "contain Coffee" in {
    val items = Menu.items()

    items("Coffee") should be (MenuItem("Coffee", true, false, 100))
  }

  "A menu" should "contain Cheese Sandwich" in {
    val items = Menu.items()

    items("Cheese Sandwich") should be (MenuItem("Cheese Sandwich", false, true, 200))
  }

  "A menu" should "contain Steak Sandwich" in {
    val items = Menu.items()

    items("Steak Sandwich") should be (MenuItem("Steak Sandwich", true, true, 450))
  }

}
