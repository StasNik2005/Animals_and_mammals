package itschool;

public class Placat extends Publication {
    String adress;

    public Placat(String author, int god, int kolichestvo, String title, String adress) {
        super(author, god, kolichestvo, title);
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Placat{" +
                "adress='" + adress + '\'' +
               super.toString() +
                '}';
    }
}
