/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzashop;

/**
 *
 * @author Anmoldeep Kaur, 2024
 */
class CustomizedPizza extends PizzaDecorator {
    private String customTopping;

    public CustomizedPizza(Pizza pizza, String customTopping) {
        super(pizza);
        this.customTopping = customTopping;
    }

    @Override
    public void bake(int temp) {
        pizza.bake(temp); 
        System.out.println("Baking with custom topping: " + customTopping);
    }
}
