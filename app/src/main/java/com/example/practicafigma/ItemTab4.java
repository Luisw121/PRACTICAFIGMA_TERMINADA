package com.example.practicafigma;

public class ItemTab4 {
    private String titleTab4;
    private String precioTab4;
    private int imageResIdTab4;
    private boolean isFavourtiteTab4;

    public ItemTab4(String titleTab4, String precioTab4, int imageResIdTab4) {
        this.titleTab4 = titleTab4;
        this.precioTab4 = precioTab4;
        this.imageResIdTab4 = imageResIdTab4;
        this.isFavourtiteTab4 = false;
    }
    public String getTitleTab4() {
        return titleTab4;
    }

    public void setTitleTab4(String titleTab4) {
        this.titleTab4 = titleTab4;
    }

    public String getPrecioTab4() {
        return precioTab4;
    }

    public void setPrecioTab4(String precioTab4) {
        this.precioTab4 = precioTab4;
    }

    public int getImageResIdTab4() {
        return imageResIdTab4;
    }

    public void setImageResIdTab4(int imageResIdTab4) {
        this.imageResIdTab4 = imageResIdTab4;
    }

    public boolean isFavourtiteTab4() {
        return isFavourtiteTab4;
    }

    public void setFavourtiteTab4(boolean favourtiteTab4) {
        isFavourtiteTab4 = favourtiteTab4;
    }
}
