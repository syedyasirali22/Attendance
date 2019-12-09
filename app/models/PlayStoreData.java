package models;

import io.ebean.Finder;

import javax.persistence.*;

@Entity(name = "play_store_data")
public class PlayStoreData {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name = "App")
    private String app;

    @Column(name = "Category")
    private String category;

    @Column(name="Rating")
    private String rating;

    @Column(name="Reviews")
    private String reviews;


    @Column(name="Size")
    private String size;


    @Column(name="Installs")
    private Integer installs;


    @Column(name="Type")
    private String type;


    @Column(name="Price")
    private String price;


    @Column(name="ContentRating")
    private String contentRating;


    @Column(name="Genres")
    private String genres;


    @Column(name="LastUpdated")
    private String lastUpdated;


    @Column(name="CurrentVer")
    private String currentVer;


    @Column(name="AndroidVer")
    private String androidVer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getInstalls() {
        return installs;
    }

    public void setInstalls(Integer installs) {
        this.installs = installs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCurrentVer() {
        return currentVer;
    }

    public void setCurrentVer(String currentVer) {
        this.currentVer = currentVer;
    }

    public String getAndroidVer() {
        return androidVer;
    }

    public void setAndroidVer(String androidVer) {
        this.androidVer = androidVer;
    }

    public static final Finder<Integer, PlayStoreData> find = new Finder<>(PlayStoreData.class);
}
