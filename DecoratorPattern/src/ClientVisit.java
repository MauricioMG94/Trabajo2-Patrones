import java.util.Date;

public class ClientVisit extends DecoratorInteraction {

    private String notes;
    private String addressVisit;

    public ClientVisit(InteractionBase interaction, String addressVisit, String notes) {
        super(interaction);
        this.addressVisit = addressVisit;
        this.notes = notes;
    }
    
    @Override
    public Date getCreationDate() {
        return super.getCreationDate();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getInteractionNotes() {
        return this.notes;
    }

    @Override
    public String getInteractionType() {
        return "Interaccion de tipo visita al cliente.";
    }

    @Override
    public String getAddress() {
        return "Direccion del cliente: " + this.addressVisit;
    }   
}
