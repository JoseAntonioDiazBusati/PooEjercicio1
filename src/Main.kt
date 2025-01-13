
// Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y
// los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar,
// aunque si consultar. Por último, tendrán que ser mayor que 0.

// Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo:
// override fun toString() = "". (Pulsa Ctrl+o)

// En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.

fun main (args: Array<String>) {

    val rectangulo1 = Rectangulo(7.0,15.6)

    println(rectangulo1.toString())
    println("El area del rectangulo es: ${rectangulo1.area()}")
    println("El perimetro del rectangulo es: ${rectangulo1.perimetro()}\n")

    val rectangulo2 = Rectangulo(4.87,1.3)

    println(rectangulo2.toString())
    println("El area del rectangulo es: ${rectangulo2.area()}")
    println("El perimetro del rectangulo es: ${rectangulo2.perimetro()}\n")

    val rectangulo3 = Rectangulo(23.81,28.99)

    println(rectangulo3.toString())
    println("El area del rectangulo es: ${rectangulo3.area()}")
    println("El perimetro del rectangulo es: ${rectangulo3.perimetro()}")
}