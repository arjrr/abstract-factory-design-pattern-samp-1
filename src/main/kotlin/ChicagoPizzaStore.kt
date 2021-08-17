class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(item: String): Pizza? {
        /** Implementing Chicago Abstract Factory */
        val pizzaIngredientFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()
        when (item) {
            "cheese" -> return CheesePizza(pizzaIngredientFactory)
            "veggie" -> return VeggiePizza(pizzaIngredientFactory)
        }
        return null
    }
}