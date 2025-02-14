class Departamento(internal val empleados: MutableList<Empleado>) {

    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun calculaSalarioTotal(): Double {
        return empleados.sumOf { it.calcularSalario() }
    }
}

