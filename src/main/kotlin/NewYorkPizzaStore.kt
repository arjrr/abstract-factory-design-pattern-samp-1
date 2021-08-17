class NewYorkPizzaStore : PizzaStore() {
    override fun createPizza(item: String): Pizza? {
        /** Implementing New York Abstract Factory */
        val pizzaIngredientFactory: PizzaIngredientFactory = NewYorkPizzaIngredientFactory()
        when (item) {
            "cheese" -> return CheesePizza(pizzaIngredientFactory)
            "veggie" -> return VeggiePizza(pizzaIngredientFactory)
        }
        return null
    }
}