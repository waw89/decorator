/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import component.Beverage;

/**
 *  This class represents a ConcreteComponent
 * @author waw
 */
public class HouseBlend implements Beverage {

    private String description;

    public HouseBlend() {
        this.description = "house blend";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getPrice() {
        return 38.0f;
    }

}
