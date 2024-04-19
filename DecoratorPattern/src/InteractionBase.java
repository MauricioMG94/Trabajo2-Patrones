import java.util.Date;

public interface InteractionBase {
    int getId();
    String getInteractionType();
    Date getCreationDate();
    String getInteractionNotes();
    String getAddress();
}
