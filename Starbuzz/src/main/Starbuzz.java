/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import component.Beverage;
import component.DarkRoast;
import component.Decaf;
import component.Expresso;
import component.HouseBlend;
import decorators.Chocolate;
import decorators.Milk;
import decorators.Soy;
import decorators.WhippedCream;
import java.util.Scanner;

/**
 *
 * @author waw
 */
public class Starbuzz {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Starbuzz starbuzz = new Starbuzz();
        starbuzz.postBeverageMenu();
        System.out.println("Pick a beverage: ");

        int option = tec.nextInt();

        Beverage selectedBeverage = null;

        switch (option) {
            case 1:
                selectedBeverage = new HouseBlend();
                break;
            case 2:
                selectedBeverage = new DarkRoast();
                break;
            case 3:
                selectedBeverage = new Expresso();
                break;
            case 4:
                selectedBeverage = new Decaf();
                break;
        }

        if (selectedBeverage != null) {
            do {
                selectedBeverage = addCondiment(selectedBeverage);
                System.out.println("total price: $" + selectedBeverage.getPrice());
                System.out.println("do you want to add another condiment? (yes/no): ");
                tec.nextLine();
            } while (tec.nextLine().equalsIgnoreCase("yes"));

            System.out.println("--------------------------");
            System.out.println("Final beverage: " + selectedBeverage.getDescription());
            System.out.println("Final price: $" + selectedBeverage.getPrice());
        } else {
            System.out.println("Invalid option.");
        }
    }

    /**
     * This method adds a condiment to a beverage. Applies the
     * decorator pattern, recieving a beverage and returning a beverage with a
     * new condiment.
     *
     * @param beverage the beverage for applying the decorator pattern
     * @return the decorator object
     */
    public static Beverage addCondiment(Beverage beverage) {
        Scanner tec = new Scanner(System.in);

        Starbuzz starbuzz = new Starbuzz();
        starbuzz.postCondimentMenu();
        int option = tec.nextInt();

        switch (option) {
            case 1:
                beverage = new Milk(beverage);
                break;
            case 2:
                beverage = new Chocolate(beverage);
                break;
            case 3:
                beverage = new Soy(beverage);
                break;
            case 4:
                beverage = new WhippedCream(beverage);
                break;

            default:
                break;

        }
        return beverage;
    }

    /**
     * This method only prints the menu of condiments
     */
    public void postCondimentMenu() {

        System.out.println();
        System.out.println("(1) Milk" + " -> $5");
        System.out.println("(2) Chocolate" + " -> $5");
        System.out.println("(3) Soy" + " -> $5");
        System.out.println("(4) Whipped Cream" + " -> $5");
        System.out.println("(5) None" + "");
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("please pick a condiment of the list: ");
    }

    /**
     * This method only prints the menu of beverages
     */
    public void postBeverageMenu() {

        Beverage b1 = new HouseBlend();
        Beverage b2 = new DarkRoast();
        Beverage b3 = new Expresso();
        Beverage b4 = new Decaf();

        System.out.println("--------------------------");
        System.out.println("Starbuzz Coffee - Menu");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("1. " + b1.getDescription() + " -> $" + b1.getPrice());
        System.out.println("2. " + b2.getDescription() + " -> $" + b2.getPrice());
        System.out.println("3. " + b3.getDescription() + " -> $" + b3.getPrice());
        System.out.println("4. " + b4.getDescription() + " -> $" + b4.getPrice());
        System.out.println();
        System.out.println("--------------------------");

    }
}
