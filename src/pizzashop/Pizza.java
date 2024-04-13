/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public int bakeTemp = 100;
    private final List<String> ingredients = new ArrayList<>();
    private final List<PizzaStatusListener> listeners = new ArrayList<>();

    public void bake(int temp) {
        bakeTemp = temp;
        System.out.println("Pizza baked at " + bakeTemp + " degrees.");
    }

    public void addTopping(String topping) {
        ingredients.add(topping);
    }

    public void registerListener(PizzaStatusListener listener) {
        listeners.add(listener);
    }

    public void notifyListeners() {
        for (PizzaStatusListener listener : listeners) {
            listener.onPizzaReady(this);
        }
    }
}
