package itschool;

public class Library {
    Publication[] publications;
    public Library(int n) {
        this.publications = new Publication[n];
    }

    public void fill(){
        for (int c = 0; c < publications.length; c++) {
            String title = "book" + c;
            String author = "author" + c;
            int kol_str = (int)(Math.random()*10000);
            int god_izdania = 1564+(int)(Math.random()*455);
            // Type type = ;//(int)(Math.random()*(new Date().getYear()));
            publications[c] = new Publication(author,god_izdania,kol_str,title);
        }
    }
}

