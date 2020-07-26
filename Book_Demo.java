package by.literature.masalova;

public class Book_Demo {
    private Genre_Demo genre;
    private Author_ author;
    private String title;

    public Book_Demo(String title, Author_ author, Genre_Demo genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String toString() {
        return "\nThe book \"" + title + "\" {" + getAuthor().toStringAuthor() +
                ", genre of the book - " + getGenre() +
                '}';
    }

    public Author_ getAuthor() {
        return author;
    }

    public void setAuthor(Author_ author) {
        this.author = author;
    }

    public Genre_Demo getGenre() {
        return genre;
    }

    public void setGenre(Genre_Demo genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {


        Book_Demo book1 = new Book_Demo("Harry Potter", new Author_Demo("Rowling", "British", Genre_Demo.FANTASY), Genre_Demo.FANTASY);
        System.out.println(book1.toString());

        Book_Demo book2 = new Book_Demo("The Adventures of Sherlock Holmes", new Author_Demo("Doyle", "British", Genre_Demo.MYSTERY), Genre_Demo.MYSTERY);
        System.out.println(book2.toString());


    }
}
