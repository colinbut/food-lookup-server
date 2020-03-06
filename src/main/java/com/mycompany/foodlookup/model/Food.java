package com.mycompany.foodlookup.model;

public class Food {
    private String description;
    private int kcal;
    private double protein_g;
    private double carbohydrate_g;
    private double sugar_g;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public double getProtein_g() {
        return protein_g;
    }

    public void setProtein_g(double protein_g) {
        this.protein_g = protein_g;
    }

    public double getCarbohydrate_g() {
        return carbohydrate_g;
    }

    public void setCarbohydrate_g(double carbohydrate_g) {
        this.carbohydrate_g = carbohydrate_g;
    }

    public double getSugar_g() {
        return sugar_g;
    }

    public void setSugar_g(double sugar_g) {
        this.sugar_g = sugar_g;
    }
}
