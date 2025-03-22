import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//-----------------------------------------------------------Kata 1-----------------------------------------------------//

        Estudiante estudiante1 = new Estudiante("Molaro", "1PRROG2", 7.5,"Luciano");
        estudiante1.mostrarInfo();
        estudiante1.subirCalifacion(4);
        estudiante1.bajarCalifacion(3.8);
        estudiante1.mostrarInfo();

//-----------------------------------------------------------Kata 2-----------------------------------------------------//

        Mascota mascota1 = new Mascota();
        mascota1.setNombre("Baloo");
        mascota1.setEspecie("Perro");
        mascota1.setEdad(13);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();

//-----------------------------------------------------------Kata 3-----------------------------------------------------//

        Libro libro1 = new Libro();
        libro1.setAnioPublicacion(2000);
        libro1.setAnioPublicacion(198);
        libro1.mostrarInfo();

//-----------------------------------------------------------Kata 4-----------------------------------------------------//

        Gallina gallina1 = new Gallina(10);
        Gallina gallina2 = new Gallina(12);

        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();

        gallina1.envejecer();
        gallina2.envejecer();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

//-----------------------------------------------------------Kata 5-----------------------------------------------------//

        while (true){
            System.out.println("Cree una nave");
            System.out.println("Nombre de la nave:");
            NaveEspacial nave=new NaveEspacial(sc.nextLine());

            nave.mostrarEstado();
            int accion;
            while (true){
                do {
                    System.out.println("Seleccione que desea hacer:" + "\n" +
                            "1 - Despegar:" + "\n" +
                            "2 - Cargar combustible" + "\n" +
                            "3 - Avanzar " + "\n" +
                            "4 - Mostrar estado " + "\n" +
                            "5 - Aterrizar" + "\n");
                    System.out.println("Ingrese el numero de la accion que desea realizar");
                    accion=nave.validarNumero(sc.nextLine());
                }while(accion>5 || accion<1);
                if (accion==1){
                    nave.despegar();
                }else if(accion==3 && !nave.estaVolando()){
                    System.out.println("Primero debe despegar para avanzar.");
                    continue;
                } else if (accion==2) {
                    System.out.println("Ingrese la cantidad de combustible a cargar");
                    nave.cargarCombustible(nave.validarNumero(sc.nextLine()));
                } else if (accion==3) {
                    System.out.println("Ingrese la distancia que quiere avanzar");
                    nave.avanzar(nave.validarNumero(sc.nextLine()));
                } else if (accion==4) {
                    nave.mostrarEstado();
                } else if (accion==5) {
                    System.out.println("Nave aterrizando...");
                    break;
                }
            }
            System.out.println("La nave aterrizo correctamente. Viaje finalizado");
            System.out.println("Desea hacer otro viaje? escriba si o no");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("NO")){
                break;
            }
        }

    }
}