/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_hw4_abstraction;

public interface SalesCalculator {
    double calculatePhoneSales(double phonePrice, int phoneQty);
    double calculateRepairSales(double repairPerHr, int repairNoOfHrs);
    double calculateTotalSales(double totalPhoneSales, double totalRepairSales);
}

