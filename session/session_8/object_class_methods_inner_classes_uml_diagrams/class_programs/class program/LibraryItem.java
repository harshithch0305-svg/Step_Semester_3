
class LibraryItem {
    String title;
    int dueDays;

    LibraryItem(String title, int dueDays) {
        this.title = title;
        this.dueDays = dueDays;
    }

    void showDetails() {
        System.out.println("Book Name: " + title);
        System.out.println("Days Overdue: " + dueDays);
    }
}

class Book extends LibraryItem {
    Book(String title, int dueDays) {
        super(title, dueDays);
    }

    void calculateFine() {
        int fine = dueDays * 5;
        System.out.println("Library Fine: Rs. " + fine);
    }
}

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 4);

        book.showDetails();
        book.calculateFine();
    }
}