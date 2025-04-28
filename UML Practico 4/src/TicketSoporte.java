import java.time.LocalDateTime;
import java.util.Date;

public class TicketSoporte {
    private static int countID=1;
    private int ticketID;
    private String  descripcion, estado;
    private Date fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

    public TicketSoporte(String descripcion){
        this.ticketID = this.countID;
        countID++;
        this.descripcion=descripcion;
        this.fechaCreacion=new Date(2025,4,28);

        this.estado="Abierto";
    }

    public TicketSoporte(String descripcion, Usuario usuario){
        this.ticketID =countID;
        countID++;
        this.descripcion=descripcion;

        this.estado="Abierto";
        this.usuario=usuario;
    }
    public void cambiarEstado(){
        if (this.estado.equalsIgnoreCase("abierto")){
            this.estado="En proceso";
            System.out.println("Ticket en proceso.");
        }else System.out.println("El ticket  se encuentra cerrado.");
    }

    public void cerrarTicket(){
        if (this.estado.equalsIgnoreCase("abierto") || this.estado.equalsIgnoreCase("en proceso")){
            this.estado="Cerrado";
            System.out.println("Ticket cerrado correctamente.");
        }else System.out.println("El ticket ya se encuentra cerrado.");
    }

    public void asignarTecnico(Tecnico tecnico){
        this.tecnico=tecnico;
    }

    public void mostrarDetalles(){
        System.out.println("ID ticket: "+ this.ticketID + "\n" +
                "Fecha de creacion: "+ this.fechaCreacion + "\n" +
                "Descripcion: " + this.descripcion + "\n" +
                "Estado del ticket: " + estado + "\n");
    }


}
