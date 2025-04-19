package com.example.question2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.question2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvWelcome;
    RecyclerView recyclerView;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome = findViewById(R.id.tvWelcome);
        recyclerView = findViewById(R.id.recyclerView);

        // Retrieve username from SharedPreferences
        SharedPreferences prefs = getSharedPreferences("ComicAppPrefs", Context.MODE_PRIVATE);
        String username = prefs.getString("username", "admin");

        // Set the welcome message
        tvWelcome.setText("Welcome " + username);

        // Initialize product list and set up RecyclerView
        productList = getProducts();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProductAdapter(this, productList));
    }

    private List<Product> getProducts() {
        List<Product> list = new ArrayList<>();

        // Adding products to the list
        list.add(new Product(
                "CasualTshirt",
                "product1",
                "₹799",
                "A short Sleeve Tshirt."
        ));
        list.add(new Product(
                "CasualTshirt",
                "product1",
                "₹799",
                "A short Sleeve Tshirt."
        ));
        list.add(new Product(
                "CasualTshirt",
                "product1",
                "₹799",
                "A short Sleeve Tshirt."
        ));
        list.add(new Product(
                "CasualTshirt",
                "product1",
                "₹799",
                "A short Sleeve Tshirt."
        ));
        list.add(new Product(
                "CasualTshirt",
                "product1",
                "₹799",
                "A short Sleeve Tshirt."
        ));



        return list;
    }
}
