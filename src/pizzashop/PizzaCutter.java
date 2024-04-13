/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class that models a pizza cutter.
 * We only ever want one pizza cutter to 
 * cut the pizzas to ensure consistency.
 * Users can choose how many slices to
 * divide the pizza into.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author Anmoldeep Kaur, 2024
 */

public class PizzaCutter {
    public int numSlices = 0;

    public PizzaCutter() {
    }

    public void cutPizza(int numSlices) {
        System.out.println("Pizza cut into " + numSlices + " slices.");
    }
}
