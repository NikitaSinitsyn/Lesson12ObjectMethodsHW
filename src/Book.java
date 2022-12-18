import java.util.Objects;

public class Book {
    private String name;
    private Author authorName;
    private int publicationDate;

    public Book(String name, Author authorName, int publicationDate) {
        this.name = name;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return name + authorName + publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationDate == book.publicationDate && name.equals(book.name) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, publicationDate);
    }
}
