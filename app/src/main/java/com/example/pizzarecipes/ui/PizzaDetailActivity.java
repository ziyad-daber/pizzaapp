package com.example.pizzarecipes.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_detail_activity);

        long pizzaId = getIntent().getLongExtra("pizza_id", -1);
        Produit selectedPizza = ProduitService.getInstance().findById(pizzaId);

        ImageView pizzaImageView = findViewById(R.id.detailImagePizza);
        TextView pizzaTitleView = findViewById(R.id.detailNomPizza);
        TextView pizzaMetaView = findViewById(R.id.detailMetaPizza);
        TextView pizzaIngredientsView = findViewById(R.id.detailIngredientsPizza);
        TextView pizzaDescriptionView = findViewById(R.id.detailDescriptionPizza);
        TextView pizzaStepsView = findViewById(R.id.detailStepsPizza);

        if (selectedPizza != null) {

            pizzaImageView.setImageResource(selectedPizza.getImageResourceId());
            pizzaTitleView.setText(selectedPizza.getName());
            pizzaMetaView.setText(
                    selectedPizza.getPreparationTime() + " • " +
                            selectedPizza.getPrice() + " €"
            );
            pizzaIngredientsView.setText(selectedPizza.getIngredientList());
            pizzaDescriptionView.setText(selectedPizza.getDescription());
            pizzaStepsView.setText(selectedPizza.getSteps());

        } else {
            pizzaTitleView.setText("Pizza introuvable !");
        }
    }
}