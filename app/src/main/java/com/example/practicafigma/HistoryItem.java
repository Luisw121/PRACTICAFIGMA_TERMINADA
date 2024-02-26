package com.example.practicafigma;

public class HistoryItem {
    private int imageRes; // Recurso de imagen
    private String title; // Título del elemento
    private String description; // Descripción del elemento


    // Constructor
    public HistoryItem(int imageRes, String title, String description) {
        this.imageRes = imageRes;
        this.title = title;
        this.description = description;
    }

    // Getters y setters (opcional, dependiendo de tus necesidades)
    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
