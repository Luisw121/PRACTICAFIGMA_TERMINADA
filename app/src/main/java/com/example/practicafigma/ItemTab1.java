package com.example.practicafigma;

public class ItemTab1 {
    private String titleTab1;
    private String precioTab1;
    private int imageResIdTab1;
    private boolean isFavourtiteTab1;

    public ItemTab1(String titleTab1, String precioTab1, int imageResIdTab1) {
        this.titleTab1 = titleTab1;
        this.precioTab1 = precioTab1;
        this.imageResIdTab1 = imageResIdTab1;
        this.isFavourtiteTab1 = false;
    }

    public boolean isFavourtiteTab1() {
        return isFavourtiteTab1;
    }

    public void setFavourtiteTab1(boolean favourtiteTab1) {
        isFavourtiteTab1 = favourtiteTab1;
    }

    public String getTitle() {
        return titleTab1;
    }

    public String getPrecio() {
        return precioTab1;
    }

    public int getImageResId() {
        return imageResIdTab1;
    }

    public void setTitle(String titleTab1) {
        this.titleTab1 = titleTab1;
    }

    public void setPrecio(String precioTab1) {
        this.precioTab1 = precioTab1;
    }

    public void setImageResId(int imageResIdTab1) {
        this.imageResIdTab1 = imageResIdTab1;
    }
}
