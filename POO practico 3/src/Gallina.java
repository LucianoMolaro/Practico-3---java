public class Gallina {
    private int Gallina;
    private static int idGallina;
    private int edad, huevosPuestos;

    public Gallina(int edad){
        this.edad=edad;
        idGallina++;
        this.Gallina=idGallina;
        this.huevosPuestos=0;
    }

    public void mostrarEstado(){
        System.out.println(
                "ID gallina: " + Gallina + "\n" +
                        "Edad: " + edad + "\n" +
                        "Huevos puestos: " + huevosPuestos + "\n");
    }

    public void ponerHuevo(){
        this.huevosPuestos++;
    }

    public void envejecer(){
        this.edad++;
    }

}
