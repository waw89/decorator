/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package decorators;

import component.Beverage;

/**
 * The Condiment class is the representation of our Decorator
 * @author waw
 */
public abstract class Condiment implements Beverage {
    
    private Beverage beverage;
    
    
    public Condiment(Beverage beverage){
        this.beverage = beverage; 
    } 
    
    protected Beverage getBeverage(){
        return beverage; 
    }    
}
