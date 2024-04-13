/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzashop;

/**
 *
 * @author Anmoldeep Kaur, 2024
 */
public class CustomerPizzaStatusListener implements PizzaStatusListener {
    
    public void onPizzaReady(Pizza pizza) {
        System.out.println("Customer notified: Pizza is ready!");
    }
}
