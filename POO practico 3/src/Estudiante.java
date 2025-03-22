import java.util.Calendar;

public class Estudiante {
    private String nombre, apellido, curso;
    private double calificacion;

    public Estudiante(String apellido, String curso, double calificacion, String nombre) {
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Curso: " + this.curso + "\n" +
                "Calificación: " + this.calificacion + "\n"
        );
    }

    public void subirCalifacion(double puntos){
        if (puntos<10 || puntos>0){
            if ((calificacion+puntos)>10){
                calificacion=10;
                System.out.println("Calificación subida correctamente");
            }else {
                calificacion+=puntos;
                System.out.println("Calificación subida correctamente");
            };

        }else {
            System.out.println("Error, la calificación debe ser entre 0 y 10");
        }
    }

    public void bajarCalifacion(double puntos){
        if (puntos<10 || puntos>0){
            if ((calificacion+puntos)<0){
                calificacion=0;
                System.out.println("Calificación bajada correctamente");
            }else {
                calificacion-=puntos;
                System.out.println("Calificación bajada correctamente");
            };

        }else {
            System.out.println("Error, la calificación debe ser entre 0 y 10");
        }
    }
}
