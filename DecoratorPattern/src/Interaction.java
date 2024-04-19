import java.util.Date;

public class Interaction implements InteractionBase {

    private String notes;

    public Interaction(String notes) {
        this.notes = notes;
    }

    @Override
    public int getId() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }

    @Override
    public Date getCreationDate() {
        return new Date();
    }

    @Override
    public String getInteractionNotes() {
        return this.notes;
    }

    @Override
    public String getInteractionType() {
        return "Interaccion de tipo: ";
    }

    @Override
    public String getAddress() {
        return "Direccion: ";
    }
    
}
