package Task5;

import java.security.spec.RSAOtherPrimeInfo;

public class Book {
    private String Name;
    private String AuthorName;
    private int Year;
    private String PublishingName;
    private String Genre;
    private int NumOfPages;

    public Book() {
    }

    ;

    public Book(String name, String authorName, int year, String publishingName, String genre, int numOfPages) {
        Name = name;
        AuthorName = authorName;
        Year = year;
        PublishingName = publishingName;
        Genre = genre;
        NumOfPages = numOfPages;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getPublishingName() {
        return PublishingName;
    }

    public void setPublishingName(String publishingName) {
        PublishingName = publishingName;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getNumOfPages() {
        return NumOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        NumOfPages = numOfPages;
    }

    public void Show() {
        System.out.println("*** Book ****");
        System.out.println("Name - " + Name);
        System.out.println("Author's name - " + AuthorName);
        System.out.println("Year of publishing - " + Year);
        System.out.println("Name of publishing - " + PublishingName);
        System.out.println("Number of pages - " + NumOfPages);
        System.out.println("---------------");
    }

    public void Show(String yourName) {
        this.Show();
        System.out.println("Your name - " + yourName + " ;)");
        System.out.println("---------------");

    }

}
