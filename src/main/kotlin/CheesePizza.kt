class CheesePizza(
    private val abstractFactory: PizzaIngredientFactory
) : Pizza() {

    override fun prepare() {
        name = "Cheese Pizza"
        dough = abstractFactory.createDough()
        cheese = abstractFactory.createCheese()
    }

}