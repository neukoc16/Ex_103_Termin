
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Konstantin
 */
public class Appointment {

    private LocalDateTime date;
    private String text;

    public Appointment(LocalDateTime date, String text) {
        this.date = date;
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s ---> %s", date.format(DateTimeFormatter.ofPattern("dd.MM.yyy - HH.mm")), text);
    }

}
