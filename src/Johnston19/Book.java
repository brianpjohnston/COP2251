package Johnston19;

public class Book extends Printed {

    private String genre;

    public Book(String title, String genre) {
        super(title);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book genre = " + genre + ", " + super.toString();
    }
}