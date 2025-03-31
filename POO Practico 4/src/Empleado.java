import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    private final List<Integer> idGenerados = new ArrayList<>();

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario= 296832;
        this.id=generarId();
        agregarId(this.id);
        totalEmpleados++;
    }

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        agregarId(this.id);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public int generarId(){
        int idn = (int)(Math.random()*1000)-10;
        return validarId(idn);
    }

    public int validarId(int idn){
        if (!idGenerados.contains(idn)){
            return idn;
        }else{
            int idm=validarId(Integer.parseInt(String.valueOf((Math.random()*1000)-10)));
            return idm;
        }
    }

    public void actualizarSalario(int porcentaje){
        this.salario+=this.salario*(porcentaje/100);
    }

    public void actualizarSalario(double cantidadFija){
        this.salario+=cantidadFija;
    }
    @Override
    public String toString(){
        return "ID del empleado: " + this.id + "\n" +
                "Nombre empleado: " + this.nombre + "\n" +
                "Puesto: " + this.puesto + "\n" +
                "Salario: " + this.salario;
    }

    public static void mostrarTotalEmpleados(){
        System.out.println("La cantidad total de empleados cargados es: " + totalEmpleados);
    }

    public void agregarId(int id){
        idGenerados.add(id);
    }
}
