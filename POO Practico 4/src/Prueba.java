public class Prueba {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(123,"Luciano", "secretario", 350000 );
        Empleado emp2 = new Empleado(465,"Martin", "administrador", 300000 );
        Empleado emp3 = new Empleado("Facundo", "empleado");
        Empleado emp4 = new Empleado("Jeronimo", "empleado");

        System.out.println(emp4);
        Empleado.mostrarTotalEmpleados();
    }
}