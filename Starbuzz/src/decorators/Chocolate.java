/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorators;

import component.Beverage;

/**
 *  This class represents a ConcreteDecorator
 * @author waw
 */
public class Chocolate extends Condiment{
    
     public Chocolate(Beverage beverage){
        super(beverage); 
    }
    @Override
    public String getDescription() {
        return getBeverage().getDescription()+" with chocolate"; 
    }

    @Override
    public float getPrice() {
       return getBeverage().getPrice() + 5.0f; 
    }
}
