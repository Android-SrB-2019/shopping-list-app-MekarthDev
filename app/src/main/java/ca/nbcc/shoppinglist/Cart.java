package ca.nbcc.shoppinglist;


import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
//    public class Item{
//        public String Food;
//        public Integer Quantity;
//
//        public String getFood() {
//            return Food;
//        }
//
//        public void setFood(String food) {
//            Food = food;
//        }
//
//        public Integer getQuantity() {
//            return Quantity;
//        }
//
//        public void setQuantity(Integer quantity) {
//            Quantity = quantity;
//        }
//    }
//
//    ArrayList<Item> cart = new ArrayList();
    HashMap<String, Integer> cart = new HashMap<>();

    public void addItem(String item){
        if(cart.containsKey(item)){
            Integer amount = cart.get(item);
            cart.replace(item, amount, amount + 1);
        }else{
            cart.put(item, 1);
        }
    }

    public String sendCart(){
        String cartFinal = "";
        for(String key : cart.keySet()){
            Integer amount = cart.get(key);
            cartFinal += key + " " + Integer.toString(amount) + "\n";
        }
        return cartFinal;
    }

    public void getCart(String cartX){
        for(String key : cartX.split("\n")){
            String[] pairs = key.split(" ");
            cart.put(pairs[0], Integer.parseInt(pairs[1]));
        }
    }
}
