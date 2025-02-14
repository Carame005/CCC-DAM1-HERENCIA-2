class EmpleadoPorHora(nombre : String,id : String, var horasTrabajadas : Int, var tarifaPorHora: Double) : Empleado(nombre,id) {

    override fun calcularSalario(): Double {
        var salario = horasTrabajadas*tarifaPorHora
        return salario
    }
}