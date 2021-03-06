package com.example.java.model;

public class ClothingItem {
    private String type;
    private String size;
    private double price;
    //create constructor, getter&Setter and toString for the above
    public ClothingItem(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //improve debug method by using getClass to get the actual class name
    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
