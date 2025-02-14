class EmpleadoFijo (nombre : String,id : String, var salarioFijo : Double, var numPagas : Int) : Empleado(nombre,id) {

    override fun calcularSalario(): Double {
        return salarioFijo*numPagas
    }
    override fun toString(): String {
        return "Empleado $nombre con ID $id tiene un salario de ${calcularSalario()} al mes"
    }
}