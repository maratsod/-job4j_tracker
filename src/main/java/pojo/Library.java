package pojo;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("1", 110);
        Book b2 = new Book("2", 120);
        Book b3 = new Book("3", 130);
        Book clean = new Book("Clean code", 140);
        Book[] books = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = clean;
        for (Book b : books) {
            System.out.println(b.toString());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book b : books) {
            System.out.println(b.toString());
        }
        for (Book b : books) {
            if (b.getName().equals("Clean code")) {
                System.out.println(b);
            }
        }
    }
}
