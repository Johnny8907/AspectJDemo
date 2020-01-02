package com.example.aspectjdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import Shopping.Inventory;
import Shopping.Item;
import Shopping.ShoppingCart;
import Shopping.ShoppingCartOperator;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setText("Hello AspectJ!");
//        Log.d("JointPointTraceAspect", "MainActivity onCreate");
//        Animal animal = new Animal();
//        animal.run();
        Inventory inventory = new Inventory();
        Item item1 = new Item("1", 30);
        Item item2 = new Item("2", 31);
        Item item3 = new Item("3", 32);
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);
        ShoppingCart sc = new ShoppingCart();
        ShoppingCartOperator.addShoppingCartItem(sc, inventory, item1);
        ShoppingCartOperator.addShoppingCartItem(sc, inventory, item2);
    }
}
