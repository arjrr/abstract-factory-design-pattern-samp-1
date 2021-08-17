class NewYorkPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

}