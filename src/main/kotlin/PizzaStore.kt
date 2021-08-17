abstract class PizzaStore {

    /** Factory method  */
    protected abstract fun createPizza(item: String): Pizza?

    fun orderPizza(type: String): Pizza? {
        val pizza = createPizza(type)
        pizza?.prepare()
        println("--- Making a ${pizza?.name} ---")
        println("--- Dough: ${pizza?.dough?.description} ---")
        println("--- Cheese: ${pizza?.cheese?.description} ---")
        return pizza
    }

}