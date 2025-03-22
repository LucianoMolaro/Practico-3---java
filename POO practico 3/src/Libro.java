public class Libro {
    private String titulo, autor;
    private int anioPublicacion;

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anio){
        if(anio<2025 && anio>1900){
            this.anioPublicacion = anio;
        }else {
            System.out.println("No se pudo establecer commo año de publicación");
        }
    }

    public void mostrarInfo(){
        System.out.println(
                "titulo: " + titulo + "\n" +
                        "Autor: " + autor + "\n" +
                        "año de publicación: " + anioPublicacion + "\n");
    }
}
