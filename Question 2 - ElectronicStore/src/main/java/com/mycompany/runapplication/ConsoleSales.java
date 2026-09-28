/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author gkhaa
 */
public class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("\n===== CONSOLE SALES REPORT =====");
        System.out.println("Console type : " + getConsoleType());
        System.out.println("Store name   : " + getStore());
        System.out.println("Total sales  : R" + getTotalSales());
    }
}
