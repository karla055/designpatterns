package com.source.designpattern.strategy;

public class StategyCartTest {
    public static void main(String[] args) {
       ShoppingCart shoppingCart = new ShoppingCart();
       Item item = new Item("1234",10);
       Item item1 =  new Item("5678",40);

       shoppingCart.addItem(item);
       shoppingCart.addItem(item1);

       shoppingCart.pay(new PaypalStrategy("mailing@example.com", "mypwd"));
       shoppingCart.pay(new CreditCardStrategy("pankaj kumar ","123456789","789","12/15"));
    }
}
