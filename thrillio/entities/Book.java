package thrillio.entities;

public class Book extends Bookmark{
    private int publicationYear;
    private String publisher;
    private String[] author;
    private String genre;
    private double amazonRating;

    public Book(long id, String title, String profileUrl, int publicationYear, String publisher, String[] author, String genre, double amazonRating) {
        super(id, title, profileUrl);
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.author = author;
        this.genre = genre;
        this.amazonRating = amazonRating;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getAmazonRating() {
        return amazonRating;
    }

    public void setAmazonRating(double amazonRating) {
        this.amazonRating = amazonRating;
    }
}
