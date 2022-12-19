package model.models;

/**
 *
 * @author Ingrid Castro 2020341
 */
public class Movie {

    private String title;
    private double price;

    public Movie(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", price: " + price ;
    }
}