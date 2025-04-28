import java.util.ArrayList;

public class Tecnico {
    private String nombre, apellido;
    private ArrayList<TicketSoporte> ticketsAsignados;

    public void actualizarEstado(TicketSoporte ticket){
        ticket.cambiarEstado();
    }

    public void cerrarTicket(TicketSoporte ticket){
        ticket.cerrarTicket();
    }
}
