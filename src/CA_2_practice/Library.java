package CA_2_practice;

public class Library {
    public String names;
    public String address;
    public  String librarian;
    public int numemployees;

    public Book[] books;

    public Library(String names, String address, String librarian, int numemployees, Book[] books){
        setNames(names);
        setAddress(address);
        setLibrarian(librarian);
        setNumEmployees(numemployees);
        setBooks(books);
    }

    public Book[] getBooks() {
        return books;
    }

    public int getNumemployees() {
        return numemployees;
    }

    public String getAddress() {
        return address;
    }

    public String getLibrarian() {
        return librarian;
    }

    public String getNames() {
        return names;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setNumEmployees(int numemployees) {
        this.numemployees = numemployees;
    }
    public String toString() {

        String text = "";

        text =  "Library Details - " +
                "Name: " + getNames() + "  Address: " + getAddress() + "  Librarian: " + getLibrarian() +
                "  Number of Employees: " + getNumemployees()
                + "\n\nBook Details:\n\n";

        int i = 0;

        Book book = books[i];

        while(book != null) {
            text += books[i] + "\n\n";
            i++;
            book = books[i];
        }

        return text;
    }
    public int getBooKcount(){
        int total = 0;
        for(int i = 0; i < books.length; i++){
            if(books[i] !=  null){
                total+=books[i].getNumberCopies();
            }
        }
        return total;
    }
    public Book findBook(String title) {

        for(int i=0; i<books.length; i++)
            if(books[i]!=null && books[i].getTitle().equals(title))
                return books[i];

        return null;
    }

    public void addBook(Book book) {

        Book b = findBook(book.getTitle());

        if(b != null)
            b.setNumberCopies(b.getNumberCopies()+book.getNumberCopies());
        else {
            int i=0;

            while(books[i]!=null)
                i++;

            books[i] = book;
        }
    }


}
