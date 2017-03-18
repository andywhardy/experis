import org.scalatest.{BeforeAndAfter, FlatSpec, Matchers}

class BillSpec extends FlatSpec with Matchers {

  "An empty bill" should "be £0.00" in {
    val totalPrice = Bill.calculateTotalPrice(List())

    totalPrice should be ("£0.00")
  }

  "A bill of cola, coffee and a cheese sandwich" should "be £3.50" in {
    val totalPrice = Bill.calculateTotalPrice(List("Cola", "Coffee", "Cheese Sandwich"))

    totalPrice should be ("£3.50")
  }

  "A bill of coffee and a steak sandwich" should "be 5.50" in {
    val totalPrice = Bill.calculateTotalPrice(List("Coffee", "Steak Sandwich"))

    totalPrice should be ("£5.50")
  }

}
