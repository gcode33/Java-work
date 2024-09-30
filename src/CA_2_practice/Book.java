package CA_2_practice;

import javax.swing.*;
import java.util.Arrays;

public class Book {
    private String ISBN;
    private String title;
    private String publisher;
    private int numberCopies;
    private Author[] authors;

    public Book(String ISBN, String title, String publisher, int numberCopies, Author[] authors){
        setISBN(ISBN);
        setTitle(title);
        setPublisher(publisher);
        setAuthors(authors);
        setNumberCopies(numberCopies);

    }

    public String getISBN() {
        return ISBN;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public int getNumberCopies() {
        return numberCopies;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setISBN(String ISBN){this.ISBN = ISBN;}

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setNumberCopies(int numberCopies) {
        if(numberCopies >= 0) {
            this.numberCopies = numberCopies;
        }
        else {
            JOptionPane.showMessageDialog(null,"Number of copies must be positive!!!",
                    "Bad Input",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ISBN: " + getISBN() + "  Title: " + getTitle() + "  Publisher: " +
                getPublisher() + "  Author(s): " + Arrays.toString(getAuthors()) + "  Number of Copies: " +
                getNumberCopies();
    }
}

