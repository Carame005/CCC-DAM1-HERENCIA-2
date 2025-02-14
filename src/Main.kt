fun main() {

    val empleado1 = EmpleadoPorHora("Pepe" ,"645948",10,200.0)
    val empleado2 = EmpleadoFijo("Mario","546975",1200.0,20)
    val empleado3 = EmpleadoFijo("Gloria","894375",1300.0,15)
    val empleado4 = EmpleadoPorHora("Ana","851647",200,23.0)

    val departamento1 = Departamento(listOf(empleado1,empleado2,empleado3,empleado4) as MutableList<Empleado>)

    for(empleado in departamento1.empleados){
        println(empleado)
    }

}