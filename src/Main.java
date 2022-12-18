public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Francis", "Fitzgerald");
        Author secondAuthor = new Author("Napoleon", "Hill");
        Book firstBook = new Book("The Great Gatsby", firstAuthor, 1925);
        Book secondBook = new Book("Think and Grow Rich", new Author("Napoleon", "Hill"), 1936);
        System.out.println("firstAuthor = " + firstAuthor);
        System.out.println("firstAuthor.getFullName() = " + firstAuthor.getFullName());
        secondBook.setPublicationDate(1937);
        System.out.println("firstBook.getAuthorName() = " + firstBook.getAuthorName());
    }
}