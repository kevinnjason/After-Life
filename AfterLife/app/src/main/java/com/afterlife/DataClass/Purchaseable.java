package com.afterlife.DataClass;

public class Purchaseable {
    private String name;
    private float rating;
    private int sold;
    private String Url;

    public Purchaseable(String name, float rating, int sold, String url) {
        this.name = name;
        this.rating = rating;
        this.sold = sold;
        Url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
