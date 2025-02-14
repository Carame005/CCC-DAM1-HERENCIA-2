class EmpleadoFijo (nombre : String,id : String, var salarioFijo : Double, var numPagas : Int) : Empleado(nombre,id) {

    override fun calcularSalario(): Double {
        var salario = salarioFijo*numPagas
        return salario
    }
}