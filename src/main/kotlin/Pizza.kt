abstract class Pizza {
    lateinit var name: String
    lateinit var dough: Dough
    lateinit var cheese: Cheese
    abstract fun prepare()
}