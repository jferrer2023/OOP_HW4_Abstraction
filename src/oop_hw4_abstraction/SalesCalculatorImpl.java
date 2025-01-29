/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_hw4_abstraction;

public class SalesCalculatorImpl implements SalesCalculator {

    @Override
    public double calculatePhoneSales(double phonePrice, int phoneQty) {
        return phonePrice * phoneQty;
    }

    @Override
    public double calculateRepairSales(double repairPerHr, int repairNoOfHrs) {
        return repairPerHr * repairNoOfHrs;
    }

    @Override
    public double calculateTotalSales(double totalPhoneSales, double totalRepairSales) {
        return totalPhoneSales + totalRepairSales;
    }
}