/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;
import java.util.Scanner;
/**
 *
 * @author gkhaa
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Menu Option
        System.out.println("Select a console device type:");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter choice (1-3): ");
        int choice = input.nextInt();
        input.nextLine(); // clear the leftover newline

        String consoleType;
        switch (choice) {
            case 1:
                consoleType = "PlayStation 5";
                break;
            case 2:
                consoleType = "Xbox Series X";
                break;
            case 3:
                consoleType = "Nintendo Switch";
                break;
            default:
                System.out.println("Invalid choice.");
                input.close();
                return;
        }

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();

        Consoles sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();

        input.close();
    }
}