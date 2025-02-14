class EmpleadoPorHora(nombre : String,id : String, var horasTrabajadas : Int, var tarifaPorHora: Double) : Empleado(nombre,id) {

    override fun calcularSalario(): Double {
        return horasTrabajadas*tarifaPorHora
    }

    override fun toString(): String {
        return "Empleado $nombre con ID $id tiene un salario de ${calcularSalario()} al mes"
    }
}