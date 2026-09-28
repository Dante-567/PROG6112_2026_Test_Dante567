/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

/**
 *
 * @author emeris
 */
public class GamingConsole {
    
    public static void main(String[] args){
    
    String[]cities = {"Cape Town", "Port Elizabeth","Pretoria"};
    
    int[][] consoles = {
        {1000,2000,3000},
        {2000,3000,4000},
        {1500,1100,1200},
    };
    
    int total = 0;
    int maximum = consoles[0][0];
    
     for (int i = 0; i < cities.length; i++){
        for (int j = 0; i < cities[i].length(); j++){
        total = total  + consoles[i][j];
        
        if (consoles[i][j] > maximum) {
            maximum = consoles[i][j];
        }
        }
    }
    System.out.println("----------------------------------------");
    System.out.println("Gaming Consoles Report");
    System.out.printf("%-8s %-15d %-15d %15s%n", " ", "PS5", "XBOX", "SWITCH");
    System.out.println("----------------------------------------");
    
    for (int i = 0; i < cities.length; i++){
        System.out.printf("%-8s %-15d %-15d %15d%n", cities[i], consoles[i][0], consoles[i][1], consoles[i][2]);
    }
    
    System.out.println("----------------------------------------");
    System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
    System.out.println("----------------------------------------");
    
     for (int i = 0; i < cities.length; i++){
         System.out.printf("%-8s %-8d", cities[i],total);
     }
     
    System.out.println("----------------------------------------");
    System.out.println("CITY WITH THE MOST SALES");
    System.out.println("----------------------------------------");
     System.out.printf("%-8s", maximum);
    }
}