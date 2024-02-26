package com.example.practicafigma;

public class ItemTab3 {
    private String titleTab3;
    private String precioTab3;
    private int imageResIdTab3;
    private boolean isFavourtiteTab3;

    public ItemTab3(String titleTab3, String precioTab3, int imageResIdTab3) {
        this.titleTab3 = titleTab3;
        this.precioTab3 = precioTab3;
        this.imageResIdTab3 = imageResIdTab3;
        this.isFavourtiteTab3 = false;
    }

    public String getTitleTab3() {
        return titleTab3;
    }

    public void setTitleTab3(String titleTab3) {
        this.titleTab3 = titleTab3;
    }

    public String getPrecioTab3() {
        return precioTab3;
    }

    public void setPrecioTab3(String precioTab3) {
        this.precioTab3 = precioTab3;
    }

    public int getImageResIdTab3() {
        return imageResIdTab3;
    }

    public void setImageResIdTab3(int imageResIdTab3) {
        this.imageResIdTab3 = imageResIdTab3;
    }

    public boolean isFavourtiteTab3() {
        return isFavourtiteTab3;
    }

    public void setFavourtiteTab3(boolean favourtiteTab3) {
        isFavourtiteTab3 = favourtiteTab3;
    }
}
