import Menu.items

object Bill {

  val ZERO_COST: String = "£0.00"

  def calculateTotalPrice(menuItems: List[String]): String = {
    if(menuItems.isEmpty) {
      ZERO_COST
    } else {
      calculateCostOfMenuItems(menuItems)
    }
  }

  def calculateCostOfMenuItems(menuItems: List[String]): String = {
    val menuItemList = createMenuItemList(menuItems)
    val basePrice = basePriceForMenuItems(menuItemList)
    val serviceCharge = serviceChargeForMenuItems(menuItemList, basePrice)

    val totalPrice = basePrice + serviceCharge
    poundsAndPence(totalPrice)
  }

  def basePriceForMenuItems(menuItemList: List[MenuItem]): Int = {
    menuItemList.foldLeft(0)((acc, menuItem: MenuItem) => menuItem.price + acc)
  }

  def serviceChargeForMenuItems(menuItemList: List[MenuItem], basePrice: Int): Int = {
    if(hasAnyHotFood(menuItemList)) {
      twentyPercent(basePrice)
    } else if(hasAnyFood(menuItemList)) {
      tenPercent(basePrice)
    } else {
      0
    }
  }

  def tenPercent(basePrice: Int): Int = {
    basePrice / 10
  }

  def twentyPercent(basePrice: Int): Int = {
    basePrice / 10 * 2
  }

  def hasAnyFood(menuItemList: List[MenuItem]): Boolean = {
    menuItemList.exists(menuItem => menuItem.food)
  }

  def hasAnyHotFood(menuItemList: List[MenuItem]): Boolean = {
    menuItemList.exists(menuItem => menuItem.food && menuItem.hot)
  }

  def createMenuItemList(menuItems: List[String]): List[MenuItem] = {
    menuItems.map(menuItem => items()(menuItem))
  }

  def poundsAndPence(pence: Int): String = s"£${pence / 100}.${pence % 100}"

}
