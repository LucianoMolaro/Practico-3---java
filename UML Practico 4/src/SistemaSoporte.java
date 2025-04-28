import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private ArrayList<TicketSoporte> gestionTickets;

    public void crearTicket(String descripcion){
        TicketSoporte ticket = new TicketSoporte(descripcion);
        agregarTicket(ticket);
    }
    protected void agregarTicket(TicketSoporte ticket){
        if (gestionTickets==null) gestionTickets=new ArrayList<>();
        gestionTickets.add(ticket);
    }

    public void asignarTecnico(TicketSoporte ticket, Tecnico tecnico){
        ticket.asignarTecnico(tecnico);
    }

    public void mostrarTickets(){
        if (gestionTickets!=null){
            for (TicketSoporte ticket : gestionTickets){
                ticket.mostrarDetalles();
            }
        }else System.out.println("Aun no se han cargado tickets");
    }
}
