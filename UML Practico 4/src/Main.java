public class Main {
    public static void main(String[] args) {
        SistemaSoporte s1 = new SistemaSoporte();

        s1.crearTicket("Error 404");
        Tecnico t1 = new Tecnico();
        TicketSoporte ti1=new TicketSoporte("Error");
        ti1.asignarTecnico(t1);
        s1.agregarTicket(ti1);
        s1.mostrarTickets();
    }
}