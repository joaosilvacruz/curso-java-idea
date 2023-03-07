package anotacoes.constructor.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // CONSTRUCTOR
    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // SOBRECARGA DE CONSTRUCTOR
    // CONSTRUTOR COM QUANTITY PADRÃO = 0
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }



    public double totalValueInStock(){
        return quantity * price;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity = this.quantity < quantity? this.quantity: this.quantity - quantity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }

}
