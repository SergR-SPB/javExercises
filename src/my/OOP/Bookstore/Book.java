package my.OOP.Bookstore;

public abstract class Book extends AbstractPrintedEdition {


    public String getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getCountry() {
        return country;
    }
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    private String author ;
    private String bookTitle;
    private int publicationYear;
    private String country;
    private String specification;



    public Book(String id, String author, String bookTitle, int publicationYear, String country) {
        this.id = id;
        this.author = author;
        this.bookTitle =bookTitle;
        this.publicationYear=publicationYear;
        this.country=country;
    }




    public String toString (){
        return "Book ID № "+id+"[ "+
                "bookTitle: "+ getBookTitle() +
                ", author: "+getAuthor()+
                ", specification: "+getSpecification()+
                ", publicationYear: "+getPublicationYear()+
                ", country: "+getCountry()+"]";
    }





}
