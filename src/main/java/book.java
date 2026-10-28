final class Book {
    public Book(int i, String number, String s) {

    }

    public void checkOut(String phoenix) {
    }

    public void checkIn() {

    }
}
public class book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Methods
    public void checkOut(String name) {
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }

    public void checkIn() {
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "Book ID: " + id +
                "\nTitle: " + title +
                "\nISBN: " + isbn +
                "\nChecked Out: " + isCheckedOut +
                "\nChecked Out To: " + checkedOutTo;
    }
}