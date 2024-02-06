/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import component.Beverage;

/**
 * This class represents a ConcreteComponent
 * @author waw
 */
public class DarkRoast implements Beverage{
    
    private String description;

    public DarkRoast() {
        this.description = "dark roast";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getPrice() {
        return 45.0f;
    }
}
