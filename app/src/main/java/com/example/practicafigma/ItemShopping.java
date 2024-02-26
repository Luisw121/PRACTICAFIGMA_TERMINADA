package com.example.practicafigma;

// ItemShopping.java
public class ItemShopping {
    private int imageResource;
    private String title;
    private String description;
    // Agrega aquí las variables para los cinco textos adicionales y los precios

    public ItemShopping(int imageResource, String title, String description /*, otros parámetros*/) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        // Inicializa aquí los otros campos
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Agrega aquí los getters y setters para los otros campos
}

