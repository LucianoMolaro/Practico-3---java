import java.util.Scanner;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean despego=false;

    Scanner sc =new Scanner(System.in);
    public NaveEspacial(String nombre){
        combustible = 100;
        this.nombre=nombre;
        System.out.println("Nave preparada y lista para comenzar viaje");
    }

    public void mostrarEstado(){
        if (combustible==100){
            System.out.println("Nave: " + nombre);
            System.out.println("El tanque de combustible esta lleno.");
        }else {
            System.out.println("Nave: " + nombre);
            System.out.println("El tanque de combustible esta al " + combustible + "%");
        }
    }

    public void despegar() {
        System.out.println("Nave despegando...");
        despego=true;
        combustible-=10;
        System.out.println("Inicio de vuelo correctamente.");

    }

    public void avanzar(int distancia){
        System.out.println("Verificando distancia y combustible...");
        if (distancia>combustible){
            System.out.println("No se puede avanzar la distancia ingresada. Insuficiente combustible");
        }else {
            System.out.println("Nave avanzando la distancia seleccionada.");
            combustible-=distancia;
        }
    }

    public void cargarCombustible(int carga){
        if ((carga+combustible)>100){
            System.out.println("No se puede cargar mas de 100 litros de combustible, capacidad limite");
        }else {
            System.out.println("Cargando combustible...");
            combustible+=carga;
            System.out.println("Combustible cargado correctamente");
            mostrarEstado();
        }
    }

    public boolean estaVolando(){
        return despego;
    }

    public int validarNumero(String a){
        int num = 0;
        while (true) {
            try {
                num = Integer.parseInt(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error, ingrese solo números");
                a = sc.nextLine();
            }
        }
        return num;
    }
}
