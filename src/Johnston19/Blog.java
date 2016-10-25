package Johnston19;

public class Blog extends Printed {
    private String theme;

    public Blog(String title, String subject, String theme) {
        super(title);
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Blog theme = " + theme + ", " + super.toString();
    }
}