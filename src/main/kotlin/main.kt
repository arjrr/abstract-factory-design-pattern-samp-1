fun main() {

    /** Creating a New York Pizza Store */
    val pizzaStoreNY: PizzaStore = NewYorkPizzaStore()

    /** Ordering a New York style cheese and veggie pizza  */
    val cheesePizzaNY: Pizza? = pizzaStoreNY.orderPizza("cheese")
    val veggiePizzaNY: Pizza? = pizzaStoreNY.orderPizza("veggie")

    println("Order 1 - Pizza: ${cheesePizzaNY?.name}")
    println("Order 2 - Pizza: ${veggiePizzaNY?.name}")
    println("\n\n")

    /** Creating a Chicago Pizza Store */
    val pizzaStoreChicago: PizzaStore = ChicagoPizzaStore()

    /** Ordering a Chicago style cheese and veggie pizza  */
    val cheesePizzaChicago: Pizza? = pizzaStoreChicago.orderPizza("cheese")
    val veggiePizzaChicago: Pizza? = pizzaStoreChicago.orderPizza("veggie")

    println("Order 1 - Pizza: ${cheesePizzaChicago?.name}")
    println("Order 2 - Pizza: ${veggiePizzaChicago?.name}")

}