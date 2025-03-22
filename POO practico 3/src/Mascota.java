public class Mascota {
    private String nombre, especie;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo(){
        System.out.println(
                "Nombre: " + nombre + "\n" +
                "Especie: " + especie + "\n" +
                "Edad: " + edad + "\n");
    }

    public void cumplirAnios(){
        edad++;
    }
}
