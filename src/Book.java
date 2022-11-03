public class Book {
    private final String bookName;
    private final Author author;
    private int publishYear;

    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public void setPublishYear(int i) {
    }

    public boolean getPublishYear() {
        return false;
    }
}
