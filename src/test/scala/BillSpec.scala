import org.scalatest.{FlatSpec, Matchers}

class BillSpec extends FlatSpec with Matchers {

  "An empty bill" should "be £0.00" in {
    val totalPrice = Bill.calculateTotalPrice(List())

    totalPrice should be ("£0.00")
  }

  "A bill of cola, coffee and a cheese sandwich" should "be £3.85 with food service charge applied" in {
    val totalPrice = Bill.calculateTotalPrice(List("Cola", "Coffee", "Cheese Sandwich"))

    totalPrice should be ("£3.85")
  }

  "A bill of coffee and a steak sandwich" should "be 6.60 with hot food service charge applied" in {
    val totalPrice = Bill.calculateTotalPrice(List("Coffee", "Steak Sandwich"))

    totalPrice should be ("£6.60")
  }

  "A drinks only bill of coffee and cola" should "be 1.50 with no service charge applied" in {
    val totalPrice = Bill.calculateTotalPrice(List("Coffee", "Cola"))

    totalPrice should be ("£1.50")
  }

}
