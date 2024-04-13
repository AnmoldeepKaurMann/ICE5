/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
  Review class for Final Exam Part D review.
 * Creates a pizza of a given type and cuts it into slices.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author Anmoldeep Kaur, 2024
 */
//class PizzaShop {
//    private List<PizzaStatusListener> listeners = new ArrayList<>();
//
//    public void registerListener(PizzaStatusListener listener) {
//        listeners.add(listener);
    
  

public class PizzaShop {
    private static final PizzaCutter pizzaCutter = new PizzaCutter();
    private static final PizzaStatusListener customerListener = new CustomerPizzaStatusListener();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the pizza shop");
        System.out.println("What kind of pizza do you want?");
        System.out.println("Please enter exactly cheese or pepperoni");
        String type = sc.nextLine();
        PizzaFactory pf = new PizzaFactory();
        Pizza pizza = pf.createPizza(type);
        pizza.registerListener(customerListener); // Register customer as a listener
        System.out.println("how many slices would you like?");
        int numSlices = sc.nextInt();
        pizzaCutter.numSlices = numSlices;
        if (pizza != null) {
            System.out.println("Great job, here is your pizza in " + numSlices + " slices");
            pizza.notifyListeners(); // Notify observers when pizza is ready
        } else {
            System.out.println("Enter a valid pizza type so we can cut it next time!");
        }
    }
}
