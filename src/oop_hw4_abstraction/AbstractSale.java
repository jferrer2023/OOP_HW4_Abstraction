
package oop_hw4_abstraction;

public abstract class AbstractSale implements SalesItem {
    protected double price;
    protected double quantity;

    public AbstractSale(double price, double quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public abstract double calculateTotalSales();  // To be implemented in subclasses
}
