package com.example.pizzarecipes.classes;

public class Produit {

    private static long idCounter = 1;

    private long id;
    private String name;
    private double price;
    private int imageResourceId;
    private String preparationTime;
    private String ingredientList;
    private String description;
    private String steps;


    public Produit() {
        this.id = idCounter++;
    }

    public Produit(String name, double price, int imageResourceId, String preparationTime,
                   String ingredientList, String description, String steps) {

        this.id = idCounter++;
        this.name = name;
        this.price = price;
        this.imageResourceId = imageResourceId;
        this.preparationTime = preparationTime;
        this.ingredientList = ingredientList;
        this.description = description;
        this.steps = steps;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(String ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return name + " - " + price + " €";
    }
}