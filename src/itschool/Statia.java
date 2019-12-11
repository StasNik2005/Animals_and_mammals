package itschool;

public class Statia extends Publication{
    Publication publication;

    public Statia(String author, int god, int kolichestvo, String title, Publication publication) {
        super(author, god, kolichestvo, title);
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Statia{" +
                "publication=" + publication +
                super.toString()+
                '}';
    }
}
