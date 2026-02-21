package com.example.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private final Context context;
    private final List<Produit> pizzaList;

    public PizzaAdapter(Context context, List<Produit> pizzaList) {
        this.context = context;
        this.pizzaList = pizzaList;
    }

    @Override
    public int getCount() {
        return pizzaList.size();
    }

    @Override
    public Object getItem(int position) {
        return pizzaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return pizzaList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.pizza_row, parent, false);
        }

        ImageView pizzaImageView = convertView.findViewById(R.id.imagePizzaItem);
        TextView pizzaNameTextView = convertView.findViewById(R.id.textNomPizza);
        TextView pizzaMetaTextView = convertView.findViewById(R.id.textMetaPizza);

        Produit currentPizza = pizzaList.get(position);

        pizzaImageView.setImageResource(currentPizza.getImageResourceId());
        pizzaNameTextView.setText(currentPizza.getName());
        pizzaMetaTextView.setText(currentPizza.getPreparationTime() + " • " + currentPizza.getPrice() + " €");

        return convertView;
    }
}