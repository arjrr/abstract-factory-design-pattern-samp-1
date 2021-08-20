## Abstract Factory (_Design Pattern_)

Exemplo de implementação do padrão de projeto _Abstract Factory_.

Linguagem: Kotlin

## Definição

Segundo Freeman e Freeman (2004):

"**O padrão Abstract Factory:** Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas."

Diagrama de classe:

<img width="600" alt="Screen Shot 2021-04-16 at 16 15 41" src="https://user-images.githubusercontent.com/5003410/130292800-6d5752d6-a6c4-41f8-bdb1-b36f1dd8b80f.png">

<sup>Fonte: https://refactoring.guru/pt-br/design-patterns/factory-method</sup>

## Fábrica Abstrata

"Ao escrever o código que usa essa interface, desvinculamos nosso código da fábrica real que cria os produtos. Isso nos permite implementar uma variedade de fábricas que fazem produtos para contextos diferentes - como regiões diferentes, sistemas operacionais diferentes ou aparências diferentes." (FREEMAN e FREEMAN, 2004).

## Dependa de Abstrações

> "O Abstract Factory permite que um cliente use uma interface abstrata para criar um conjunto de produtos relacionados."

> "O cliente não sabe (ou não se importa) com os produtos concretos que são realmente produzidos."

> "O cliente é desvinculado de qualquer especificação dos produtos concretos."

## Implementação

Criando família de ingredientes:

**Cheese (Product)**

```kotlin
interface Cheese {
    val description: String
}
```

**ParmesanCheese (Concrete Product)**

```kotlin
class ParmesanCheese : Cheese {
    override val description: String
        get() = "Shredded Parmesan"
}
```

**PizzaIngredientFactory (Abstract Factory)**

```kotlin
interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createCheese(): Cheese
}
```

**ChicagoPizzaIngredientFactory (Concrete Factory)**

```kotlin
class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createCheese(): Cheese {
        return ParmesanCheese()
    }
}
```

**Main**

```kotlin
fun main() {

    /** Creating a Chicago Pizza Store */
    val pizzaStoreChicago: PizzaStore = ChicagoPizzaStore()

    /** Ordering a Chicago style cheese and veggie pizza  */
    val cheesePizzaChicago: Pizza? = pizzaStoreChicago.orderPizza("cheese")
    val veggiePizzaChicago: Pizza? = pizzaStoreChicago.orderPizza("veggie")

    println("Order 1 - Pizza: ${cheesePizzaChicago?.name}")
    println("Order 2 - Pizza: ${veggiePizzaChicago?.name}")

}
```
(*) Olhe as implementações da classe Pizza 