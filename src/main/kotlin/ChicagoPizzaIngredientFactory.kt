class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createCheese(): Cheese {
        return ParmesanCheese()
    }
}