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
public class Decaf implements Beverage {

    private String description;

    public Decaf() {
        this.description = "decaf";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getPrice() {
        return 30.0f;
    }
}
