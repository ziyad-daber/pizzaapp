package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService instance;
    private final List<Produit> pizzaData = new ArrayList<>();

    private ProduitService() {
        seed(); // préremplissage
    }

    public static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    private void seed() {

        pizzaData.add(new Produit(
                "BARBECUED CHICKEN PIZZA",
                3,
                com.example.pizzarecipes.R.mipmap.pizza1,
                "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n" +
                        "- 1/4 teaspoon pepper\n" +
                        "- 1 cup barbecue sauce, divided\n" +
                        "- 1 tube refrigerated pizza crust\n" +
                        "- 2 teaspoons olive oil\n" +
                        "- 2 cups shredded Gouda cheese\n" +
                        "- 1 small red onion, thinly sliced\n" +
                        "- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust. These smoky pizzas are perfect for summer dinners.",
                "STEP 1:\nGrill chicken 5-7 minutes each side.\n\n" +
                        "STEP 2:\nPress dough into rectangle and grill lightly.\n\n" +
                        "STEP 3:\nSpread sauce, add cheese, chicken and onion. Grill until melted."
        ));

        pizzaData.add(new Produit(
                "BRUSCHETTA PIZZA",
                5,
                com.example.pizzarecipes.R.mipmap.pizza2,
                "35 min",
                "- 1/2 pound pork sausage\n" +
                        "- 12-inch pizza crust\n" +
                        "- Turkey pepperoni\n" +
                        "- Mozzarella cheese\n" +
                        "- Fresh tomatoes\n" +
                        "- Basil, garlic, olive oil",
                "Hearty pizza loaded with Italian flavor and fresh tomatoes.",
                "STEP 1:\nCook sausage.\n\n" +
                        "STEP 2:\nBake with toppings 10-12 min.\n\n" +
                        "STEP 3:\nAdd fresh tomato mixture."
        ));

        pizzaData.add(new Produit(
                "SPINACH PIZZA",
                2,
                com.example.pizzarecipes.R.mipmap.pizza3,
                "25 min",
                "- Pizza crust mix\n" +
                        "- Alfredo sauce\n" +
                        "- Tomatoes\n" +
                        "- Fresh spinach\n" +
                        "- Italian cheese blend",
                "Easy and delicious veggie pizza loved by families.",
                "STEP 1:\nPrepare dough.\n\n" +
                        "STEP 2:\nAdd sauce, spinach, tomatoes, cheese.\n\n" +
                        "STEP 3:\nBake 10-15 minutes."
        ));

        pizzaData.add(new Produit(
                "DEEP-DISH SAUSAGE PIZZA",
                8,
                com.example.pizzarecipes.R.mipmap.pizza4,
                "45 min",
                "- Active dry yeast\n" +
                        "- Warm water\n" +
                        "- Flour\n" +
                        "- Vegetable oil\n" +
                        "- Oregano, basil, marjoram\n" +
                        "- Garlic & onion salt",
                "Grandma’s deep dish pizza with rich herbs and cheese.",
                "STEP 1:\nPrepare and knead dough. Let rise 1 hour.\n\n" +
                        "STEP 2:\nLayer cheese and sausage mixture.\n\n" +
                        "STEP 3:\nBake 20-30 minutes."
        ));

        pizzaData.add(new Produit(
                "HOMEMADE PIZZA",
                4,
                com.example.pizzarecipes.R.mipmap.pizza5,
                "50 min",
                "- Yeast\n" +
                        "- Sugar\n" +
                        "- Warm water\n" +
                        "- Flour\n" +
                        "- Ground beef\n" +
                        "- Tomato sauce\n" +
                        "- Mozzarella cheese",
                "Classic homemade pizza with crisp golden crust.",
                "STEP 1:\nPrepare dough and let rise.\n\n" +
                        "STEP 2:\nCook beef.\n\n" +
                        "STEP 3:\nBake 25-30 minutes."
        ));

        pizzaData.add(new Produit(
                "PESTO CHICKEN PIZZA",
                3,
                com.example.pizzarecipes.R.mipmap.pizza6,
                "50 min",
                "- Yeast\n" +
                        "- Bread flour\n" +
                        "- Chicken\n" +
                        "- Pesto\n" +
                        "- Peppers\n" +
                        "- Mozzarella",
                "Healthy pizza with pesto and colorful vegetables.",
                "STEP 1:\nPrepare dough.\n\n" +
                        "STEP 2:\nCook chicken and vegetables.\n\n" +
                        "STEP 3:\nBake until golden."
        ));

        pizzaData.add(new Produit(
                "LOADED MEXICAN PIZZA",
                3,
                com.example.pizzarecipes.R.mipmap.pizza7,
                "30 min",
                "- Black beans\n" +
                        "- Red onion\n" +
                        "- Chili powder\n" +
                        "- Tomatoes\n" +
                        "- Spinach\n" +
                        "- Cheddar & Pepper Jack",
                "Spicy Mexican-inspired pizza full of flavor.",
                "STEP 1:\nMash beans and mix spices.\n\n" +
                        "STEP 2:\nAdd toppings.\n\n" +
                        "STEP 3:\nBake 12-15 minutes."
        ));

        pizzaData.add(new Produit(
                "BACON CHEESEBURGER PIZZA",
                2,
                com.example.pizzarecipes.R.mipmap.pizza8,
                "20 min",
                "- Ground beef\n" +
                        "- Onion\n" +
                        "- Bacon\n" +
                        "- Pickles\n" +
                        "- Mozzarella\n" +
                        "- Cheddar",
                "A fun cheeseburger-style pizza kids love.",
                "STEP 1:\nCook beef.\n\n" +
                        "STEP 2:\nAdd toppings.\n\n" +
                        "STEP 3:\nBake 8-10 minutes."
        ));

        pizzaData.add(new Produit(
                "PIZZA MARGHERITA",
                1,
                com.example.pizzarecipes.R.mipmap.pizza9,
                "30 min",
                "- Yeast\n" +
                        "- Olive oil\n" +
                        "- Tomatoes\n" +
                        "- Mozzarella\n" +
                        "- Fresh basil",
                "Classic Italian pizza with fresh basil and mozzarella.",
                "STEP 1:\nPrepare dough.\n\n" +
                        "STEP 2:\nAdd tomatoes and cheese.\n\n" +
                        "STEP 3:\nBake 15-20 minutes."
        ));

        pizzaData.add(new Produit(
                "PEPPERONI-SAUSAGE STUFFED PIZZA",
                5,
                com.example.pizzarecipes.R.mipmap.pizza10,
                "45 min",
                "- Yeast\n" +
                        "- Olive oil\n" +
                        "- Flour\n" +
                        "- Sausage\n" +
                        "- Pepperoni\n" +
                        "- Mozzarella & Cheddar",
                "Stuffed pizza loaded with meat and melted cheese.",
                "STEP 1:\nPrepare dough.\n\n" +
                        "STEP 2:\nAdd filling layers.\n\n" +
                        "STEP 3:\nBake 30-35 minutes."
        ));
    }

    @Override
    public Produit create(Produit produit) {
        pizzaData.add(produit);
        return produit;
    }

    @Override
    public Produit update(Produit produit) {

        for (int i = 0; i < pizzaData.size(); i++) {

            if (pizzaData.get(i).getId() == produit.getId()) {

                pizzaData.set(i, produit);
                return produit;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return pizzaData.removeIf(produit ->
                produit.getId() == id);
    }

    @Override
    public Produit findById(long id) {

        for (Produit produit : pizzaData) {

            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(pizzaData);
    }
}