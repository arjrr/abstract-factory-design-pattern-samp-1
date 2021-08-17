class VeggiePizza(
    private val abstractFactory: PizzaIngredientFactory
) : Pizza() {

    override fun prepare() {
        name = "Veggie Pizza"
        dough = abstractFactory.createDough()
        cheese = abstractFactory.createCheese()
    }

}