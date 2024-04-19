import java.util.Date;

public class OfficeVisit extends DecoratorInteraction{

    private String additionalNotess;
    private String addressVisit;

    public OfficeVisit(InteractionBase interaction, String addressVisit, String additionalNotess) {
        super(interaction);
        this.addressVisit = addressVisit;
        this.additionalNotess = additionalNotess;
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
        return this.additionalNotess;
    }

    @Override
    public String getInteractionType() {
        return "Interaccion de tipo visita a la oficina";
    }

    @Override
    public String getAddress() {
        return "Direccion de la oficina: " + this.addressVisit;
    }
    
}
