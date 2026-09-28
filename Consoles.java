/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author emeris
 */
public abstract class Consoles implements IConsoles {
    
    protected String consoleDeviceType;
    protected String storeName;
    protected int amountOfSales;
    
    public Consoles(String consoleDeviceType,String storeName,int amountOfSales){
        this.consoleDeviceType = consoleDeviceType;
        this.storeName = storeName;
        this.amountOfSales = amountOfSales;
    }
    
    public String getconsoleDeviceType(){
        return consoleDeviceType;
    }
    
    public String getstoreName(){
        return storeName;
    }
    
    public int getamountOfSales(){
        return amountOfSales;
    }
}
