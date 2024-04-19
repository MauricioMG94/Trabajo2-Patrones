import java.util.Date;

abstract class DecoratorInteraction implements InteractionBase {
    
    protected InteractionBase interaction;

    public DecoratorInteraction(InteractionBase interaction) {
        this.interaction = interaction;
    }

    @Override
    public int getId() {
        return interaction.getId();
    }

    @Override
    public Date getCreationDate() {
        return interaction.getCreationDate();
    }

    @Override
    public String getInteractionNotes() {
        return interaction.getInteractionNotes();
    }
 
}
