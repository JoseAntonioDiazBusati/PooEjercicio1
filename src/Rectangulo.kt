class Rectangulo (val base: Double, val altura: Double) {

    init {
        require(base > 0){"La base tiene que ser mayor que 0."}
        require(altura > 0){"La altura tiene que ser mayor que 0."}
    }

    fun perimetro(): Double {
        val perimetro = 2 * (base + altura)
        return perimetro
    }

    fun area(): Double {
        val area = base * altura
        return area
    }

    override fun toString(): String {
        return "Rectángulo (base = $base, altura = $altura)"
    }
}