package CA_2_practice;

import javax.swing.*;

public class TestLibrary {
    public static void main(String[] args) {

        Author a1 = new Author("Harvey","Deitel");
        Author a2 = new Author("Brian","Kernighan");
        Author a3 = new Author("Robert","Martin");
        Author a4 = new Author("Quentin","Charatan");
        Author a5 = new Author("Paul","Deitel");
        Author a6 = new Author("Aaron","Kans");
        Author a7 = new Author("C. Thomas","Wu");
        Author a8 = new Author("Jeffrey","Listfield");
        Author a9 = new Author("Dennis","Ritchie");
        Author a10 = new Author("Bjarne","Stroustrup");

        Book b1 = new Book("0131103628", "The C Programming Language", "Prentice Hall", 6, new Author[]{a2,a9});
        Book b2 = new Book("0132350884", "Clean Code", "Prentice Hall", 5, new Author[]{a3});
        Book b3 = new Book("3319994190", "Java in Two Semesters", "Springer", 8, new Author[]{a4,a6});
        Book b4 = new Book("0132222205", "C#: How to Program", "Pearson", 6, new Author[]{a1,a5,a8});
        Book b5 = new Book("0073523305", "An Introduction to Object Oriented Programming with Java", "McGraw-Hill", 3, new Author[]{a7});

        Book allBooks[] = new Book[100];

        allBooks[0] = b1;
        allBooks[1] = b2;
        allBooks[2] = b3;
        allBooks[3] = b4;
        allBooks[4] = b5;

        Library library = new Library("MTU Kerry Library", "Dromtacker, Tralee, Co. Kerry", "Pat Doherty", 13,  allBooks);

        JOptionPane.showMessageDialog(null,library + "\n\nLibrary Book Count: " +
                library.getBooKcount(),"Library Details",JOptionPane.INFORMATION_MESSAGE);

        String title = JOptionPane.showInputDialog("Please enter the title of the book you seek");

        Book book = library.findBook(title);

        if(book == null)
            JOptionPane.showMessageDialog(null, "This book could not be found!",
                    "Book not found",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "The details of this book are as follows:\n\n" +
                    book, "Book found",JOptionPane.INFORMATION_MESSAGE);

        Book b6 = new Book("0131103628", "The C Programming Language", "Prentice Hall", 3, new Author[]{a2,a9});
        Book b7 = new Book("0134997832", "A Tour Of C++", "Pearson", 5, new Author[]{a10});

        library.addBook(b6);
        library.addBook(b7);

        JOptionPane.showMessageDialog(null,library + "\n\nLibrary Book Count: " +
                library.getBooKcount(),"Library Details",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
