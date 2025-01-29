
package oop_hw4_abstraction;


public class Repair extends AbstractSale {

    private double hoursWorked;

    public Repair(double price, double quantity, double hoursWorked) {
        super(price, quantity);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateTotalSales() {
        return price * hoursWorked;
    }
}

