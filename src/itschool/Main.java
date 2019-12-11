package itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
Publication publication =new Publication();
        Scanner scanner = new Scanner(System.in);

        int pagesNumber;
        do {
            System.out.println("Введите количество страниц:");
            pagesNumber = -1;
            //scanner.close();
            //scanner.reset();
            try {
                String s = scanner.nextLine();
                pagesNumber = Integer.parseInt(s);
            } catch (Exception exc) {
                System.out.println("Error: " + exc.getLocalizedMessage());
            }
        } while (pagesNumber <=0 || pagesNumber >10000);

        int god_isdania;
        do {
            System.out.println("Введите год издания:");
            god_isdania = -1;
            try {
                String s = scanner.nextLine();
                god_isdania = Integer.parseInt(s);
            } catch (Exception exc) {
                System.out.println("Error: " + exc.getLocalizedMessage());
            } finally {
                publication.setGod_isdania(god_isdania);
            }
        } while (publication.getGod_isdania() == -1);

        int typeNumber;

        String author = "";

        do {
            System.out.println("Введите вашего любимого автора книги:");
            author = scanner.nextLine();
        } while (!(Character.isUpperCase(author.charAt(0))));

        String title = "";

        do {
            System.out.println("Введите название книги:");
            title = scanner.nextLine();
        } while (!(Character.isUpperCase(title.charAt(0))));

        Publication publication1 = new Publication(author,god_isdania,pagesNumber,title);
        System.out.println(publication1);
*/
        Placat placat = new Placat("J.Rowling", 2019,1234 , "Harry Potter", "Odessa");
        System.out.println(placat);

        Publication publication = new Publication("Babyichuk Olha",2019,80,"Applied ascpects of information technolagy");
        Statia statia1 = new Statia("Speranskiy V.", 2019, 8, "Productivity Estimation of Serverlss Computing", publication);
        Statia statia2 = new Statia("Kungurtsev O.", 2019, 8, "Method of serching Term Interpretations for Domain Dictionaries", publication);

        System.out.println(statia1);
        System.out.println(statia2);


        Animals animal = new Animals("Animal");
        animal.printInfo();

        Mammals dog = new Mammals("Tusik", 3);
        dog.printInfo();

    }

//    Library library = new itschool.Library(5);
//        library.fill();
//        for (Book book1: library.books ) {
//        System.out.println(book1);
//    }
}