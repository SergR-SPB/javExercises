package my.OOP.Bookstore;

public class Periodical extends AbstractPrintedEdition{

    private String publisher;
    private String periodicalTitle;
    private int publicationYear;
    private String country;
    private String specification;

    public Periodical (String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPeriodicalTitle() {
        return periodicalTitle;
    }

    public void setPeriodicalTitle(String periodicalTitle) {
        this.periodicalTitle = periodicalTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Book ID № "+id+"[ "+
                "periodicalTitle: "+periodicalTitle+
                ", publisher: "+publisher+
                ", publicationYear: "+publicationYear+
                ", country: "+country+
                ", specification:"+specification+"]";
    }
}
