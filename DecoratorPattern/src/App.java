import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio Patron Decorador...");
        InteractionBase interaction = new Interaction("Nueva Interaccion -> ");
        System.out.println("Interaccion [ ");
        System.out.println("Id: " + interaction.getId());
        System.out.println("Fecha de creación: " + interaction.getCreationDate());
        System.out.println("Notas de la interacción: " + interaction.getInteractionNotes() + " ]");
        System.out.println(" ]");
        System.out.println("_____________________________________________");
        
        String addressVisit = "Calle 8 #4-712";
        String additionalNotes = "Se realizo una visita al cliente con el fin de conocer su estado.";
        interaction = new ClientVisit(interaction, addressVisit, additionalNotes);
        System.out.println("Interaccion[ ");
        System.out.println("Id: " + interaction.getId());
        System.out.println("Fecha de creación: " + interaction.getCreationDate());
        System.out.println("Notas de la interacción: " + interaction.getInteractionNotes());
        System.out.println(interaction.getInteractionType());
        System.out.println(interaction.getAddress() + " ]");
        
        System.out.println("_____________________________________________");

        String addressOffice = "Torre Colmena Piso 8 oficina 804";
        String additionalNotess = "El cliente se acerco a la oficina con el fin de conocer las novedades de los servicios.";
        interaction = new OfficeVisit(interaction, addressOffice, additionalNotess);
        System.out.println("Interaccion[ ");
        System.out.println("Id: " + interaction.getId());
        System.out.println("Fecha de creación: " + interaction.getCreationDate());
        System.out.println("Notas de la interacción: " + interaction.getInteractionNotes());
        System.out.println(interaction.getInteractionType());
        System.out.println(interaction.getAddress() + " ]");
        System.out.println("Fin Patron Decorador.");
        
        System.out.println("_____________________________________________");
    }
}
