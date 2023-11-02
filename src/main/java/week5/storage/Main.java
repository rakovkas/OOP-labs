package week5.storage;

public class Main {
    public static void main (String[] args){
        Book book1 = new Book("F. Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("R. Martin", "Clean Code", 1);
        Book book3 = new Book("K. Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Siide of the Moonn", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

    }
}
