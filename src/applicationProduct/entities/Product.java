package applicationProduct.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return quantity * price;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removerProducts(int quantity){
        this.quantity = this.quantity < quantity? this.quantity: this.quantity - quantity;
    }

}
