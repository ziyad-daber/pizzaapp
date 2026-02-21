package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.adapter.PizzaAdapter;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_pizza_activity);

        Toolbar toolbar = findViewById(R.id.toolbarList);
        setSupportActionBar(toolbar);

        ListView pizzaListView = findViewById(R.id.listPizzaView);
        List<Produit> pizzaList = ProduitService.getInstance().findAll();

        pizzaListView.setAdapter(new PizzaAdapter(this, pizzaList));

        pizzaListView.setOnItemClickListener((parentView, itemView, position, itemId) -> {
            Intent pizzaDetailIntent = new Intent(this, PizzaDetailActivity.class);
            pizzaDetailIntent.putExtra("pizza_id", itemId);
            startActivity(pizzaDetailIntent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list_pizza, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, "Pizza Recipes App 🍕");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}