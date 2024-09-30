package CA_2_practice;

public class Author {
    private static int authorId;
    private int author_number;
    private String firstName;
    private String surname;

    public Author(String firstName, String surname){
        setFirstName(firstName);
        setSurname(surname);
        author_number = ++authorId;
    }

    public String getFirstName(){return firstName;}
    public String getSurname(){return surname;}

    public int getAuthor_number(){return author_number;}


    public void setFirstName(String firstName){this.firstName= this.firstName;}

    public void setSurname(String surname){this.surname = surname;}

    public String toString() {
        return "first name: " + getFirstName() + "  last name: " + getSurname() +
                "  author number: " + getAuthor_number();
    }



}


