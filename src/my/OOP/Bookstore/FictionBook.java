package my.OOP.Bookstore;

public class FictionBook extends Book {
    private String specification = "Fiction";

    public FictionBook(String id,  String author, String bookTitle, int publicationYear, String country) {
        super(id,  author, bookTitle, publicationYear, country);
        specification = "Fiction";
    }

    @Override
    public String getSpecification() {
        return null;
    }
    public String toString (){
        String specification = "Fiction";
        return "\n Book ID № "+id+"[ "+
                "bookTitle: "+ getBookTitle() +
                ", author: "+getAuthor()+
                ", specification: "+specification+
                ", publicationYear: "+getPublicationYear()+
                ", country: "+getCountry()+"]";
    }


}
