package org.example._13_spring_boot.DTO;

public class ItemDTO {
    private int id;
    private String name;
    private String description;
    private double price;
    private int qty;

    public ItemDTO() {
    }

    public ItemDTO(int id, String name, String description, double price, int qty) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

