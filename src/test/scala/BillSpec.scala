import org.scalatest.{FlatSpec, Matchers}

class BillSpec extends FlatSpec with Matchers {

  "A bill of cola, coffee and a cheese sandwich" should "be 3.5" in {
    val bill = new Bill()
    val totalPrice = bill.calculateTotalPrice(List("Cola", "Coffee", "Cheese Sandwich"))

    totalPrice should be ("3.5")
  }

}
