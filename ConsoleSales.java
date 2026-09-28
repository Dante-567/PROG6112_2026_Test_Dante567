/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author emeris
 */
public abstract class ConsoleSales extends Consoles {
    public ConsoleSales(String consoleDeviceType,String storeName,int amountOfSales){
        super(consoleDeviceType,storeName,amountOfSales);
    }

    public void print_report(){
    System.out.println("Console Sales Report");
    System.out.println("**************************");
    System.out.println("Console Type: " + getconsoleDeviceType());
    System.out.println("Store: " + getstoreName());
    System.out.println("Total Sales: " + getamountOfSales());
    }
        
        
}
