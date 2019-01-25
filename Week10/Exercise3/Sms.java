package Week10.Exercise3;

public class Sms {
    private String title;
    private String text;

    public Sms(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
