package Johnston19;

public class TextBook extends Book {
    private String subject;

    public TextBook(String title, String genre, String subject) {
        super(title, genre);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "TextBook subject = " + subject + ", " + super.toString();
    }
}