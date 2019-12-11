package itschool;

public class Animals {
    String title;

    public String getTitle() {
        return title;
    }

    public Animals(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void sleep(){
        System.out.println("Sleep");
    }
    public void eat(){
        System.out.println("Eat");
    }
    public void move(){
        System.out.println("Move");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "title='" + title + '\'' +
                '}';
    }

    public void printInfo(){
        System.out.println(this);
        move();
        eat();
        sleep();
    }
}
