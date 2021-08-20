fun main() {

    /** Creating a Chicago Pizza Store */
    val pizzaStoreChicago: PizzaStore = ChicagoPizzaStore()

    /** Ordering a Chicago style cheese and veggie pizza  */
    val cheesePizzaChicago: Pizza? = pizzaStoreChicago.orderPizza("cheese")
    val veggiePizzaChicago: Pizza? = pizzaStoreChicago.orderPizza("veggie")

    println("Order 1 - Pizza: ${cheesePizzaChicago?.name}")
    println("Order 2 - Pizza: ${veggiePizzaChicago?.name}")

}