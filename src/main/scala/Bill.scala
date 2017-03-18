import Menu.items

object Bill {

  def calculateTotalPrice(menuItems: List[String]): String = {
    if(menuItems.isEmpty) {
      "£0.00"
    } else {
      val menuItemList = createMenuItemList(menuItems)
      val totalPrice = totalPriceForMenuItems(menuItemList)

      poundsAndPence(totalPrice)
    }
  }

  def totalPriceForMenuItems(menuItemList: List[MenuItem]): Int = {
    menuItemList.foldLeft(0)((acc, menuItem: MenuItem) => menuItem.price + acc)
  }

  def createMenuItemList(menuItems: List[String]): List[MenuItem] = {
    menuItems.map(menuItem => items()(menuItem))
  }

  def poundsAndPence(pence: Int): String = s"£${pence / 100}.${pence % 100}"

}
