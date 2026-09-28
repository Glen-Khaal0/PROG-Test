/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronicsreport;

/**
 *
 * @author gkhaalo
 */
public class Number1ElectronicsReport {

    public static void main(String[] args) {
        
        System.out.println("--------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------------");

         // initialising and assigning  declare a 2D array(4x4)
        String [] labels = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] arr = {{1000,2000,3000},
                       {2000,3000,4000},
                       {1500,1100,1200}
        };
        
        //row header
          System.out.printf("%-15s%10s%10s%10s%n", "", "PS5","XBOX", "SWITCH"); 
        
           // printing the array
        for (int i = 0; i < arr.length; i++ ){
            System.out.printf("%-15s", labels[i]);
            for (int j= 0; j < arr[i].length ; j++)
         System.out.printf("%10d",arr[i][j]);
           System.out.println(); 
        }
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------------------");


        // Summing row by row
          
        
      
        int total = 0;
               int[] rowTotals = new int[arr.length];   // one total per city

                for (int i = 0; i < arr.length; i++) {
                int rowTotal = 0;

        for (int j = 0; j < arr[i].length; j++) {
             rowTotal += arr[i][j];
           }   
    // save this city's total
        rowTotals[i] = rowTotal;             
             total += rowTotal;

    System.out.printf("%-15s%10d%n", labels[i], rowTotal);
}   

        // City with most sales
            int maxIndex = 0;
               for (int i = 1; i < rowTotals.length; i++) {
                if (rowTotals[i] > rowTotals[maxIndex]) {
                maxIndex = i;
    }
}
         System.out.println(" ");
         System.out.println("CITY WITH THE MOST SALES: " + labels[maxIndex] + " (" + rowTotals[maxIndex] + ")");
        
        
        
        }
    }
        
     
        
        
        
        
        
        
        
        
        
        
        
        
        
    

