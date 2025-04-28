import java.util.ArrayList;

public class Usuario {
    private String nombre, apellido, email;
    private ArrayList<TicketSoporte> ticketsAbiertos;

    public Usuario(String nombre, String apellido, String email){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
    }

    public void generarTicket(String descripcion){
        TicketSoporte ticket = new TicketSoporte(descripcion, this);
        agregarTicket(ticket);
    }

    private void agregarTicket(TicketSoporte ticket){
        if (ticketsAbiertos==null) ticketsAbiertos  = new ArrayList<>();
        ticketsAbiertos.add(ticket);
    }

    public void mostrarDetalleTickets(){
        for (TicketSoporte a : ticketsAbiertos){
            a.mostrarDetalles();
        }
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "Nombre: " + nombre + "\t" +
                "Apellido: " + apellido + "\t" +
                "Email: " + email + "\t";
    }
}
