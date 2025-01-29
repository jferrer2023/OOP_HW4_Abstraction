/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_hw4_abstraction;

public class Phone extends AbstractSale {

    public Phone(double price, double quantity) {
        super(price, quantity);
    }

    @Override
    public double calculateTotalSales() {
        return price * quantity;
    }
}

