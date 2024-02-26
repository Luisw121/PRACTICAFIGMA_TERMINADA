package com.example.practicafigma;

public class FavouriteItem {
    private int imageResource;
    private String title;
    private String price;
    private boolean isFavourite;

    public FavouriteItem(int imageResource, String title, String price) {
        this.imageResource = imageResource;
        this.title = title;
        this.price = price;
        this.isFavourite = false;
    }
    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }
}
