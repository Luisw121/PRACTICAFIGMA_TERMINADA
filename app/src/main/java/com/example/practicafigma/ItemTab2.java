package com.example.practicafigma;

public class ItemTab2 {
    private String titleTab2;
    private String precioTab2;
    private int imageResIdTab2;
    private boolean isFavourtiteTab2;

    public ItemTab2(String titleTab2, String precioTab2, int imageResIdTab2) {
        this.titleTab2 = titleTab2;
        this.precioTab2 = precioTab2;
        this.imageResIdTab2 = imageResIdTab2;
        this.isFavourtiteTab2 = false;
    }

    public String getTitleTab2() {
        return titleTab2;
    }

    public String getPrecioTab2() {
        return precioTab2;
    }

    public int getImageResIdTab2() {
        return imageResIdTab2;
    }

    public boolean isFavourtiteTab2() {
        return isFavourtiteTab2;
    }

    public void setFavourtiteTab2(boolean favourtiteTab2) {
        isFavourtiteTab2 = favourtiteTab2;
    }

    public void setTitleTab2(String titleTab2) {
        this.titleTab2 = titleTab2;
    }

    public void setPrecioTab2(String precioTab2) {
        this.precioTab2 = precioTab2;
    }

    public void setImageResIdTab2(int imageResIdTab2) {
        this.imageResIdTab2 = imageResIdTab2;
    }
}
