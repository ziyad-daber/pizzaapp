# Projet Android - Application de Recettes de Pizza

## Introduction

Ce projet a été réalisé dans le cadre d'un travail pratique. C'est une application Android native développée en Java qui catalogue des recettes de pizzas. L'objectif était de mettre en œuvre les concepts fondamentaux du développement Android, incluant la gestion des activités, les vues en liste (`ListView`), la navigation entre les écrans et une structuration claire du code.

## Structure du Projet

Le code source est organisé en plusieurs packages pour suivre les principes de séparation des responsabilités et assurer une bonne maintenabilité :

-   `com.example.pizzarecipes.ui`: Contient les activités qui représentent les écrans de l'application (`SplashActivity`, `ListPizzaActivity`, `PizzaDetailActivity`).
-   `com.example.pizzarecipes.adapter`: Contient l'adaptateur personnalisé (`PizzaAdapter`) qui lie les données des recettes à l'affichage dans la `ListView`.
-   `com.example.pizzarecipes.classes`: Définit la classe modèle (`Produit`) qui structure les données pour une recette de pizza.
-   `com.example.pizzarecipes.service`: Simule une source de données (`ProduitService`) pour fournir les informations sur les pizzas.
-   `com.example.pizzarecipes.dao`: Inclut l'interface `IDao`, définissant un contrat pour les opérations d'accès aux données (CRUD).

## Fonctionnalités Clés

-   **Écran de Démarrage**: Un écran d'accueil s'affiche au lancement de l'application pour une meilleure expérience utilisateur.
-   <img width="318" height="565" alt="image" src="https://github.com/user-attachments/assets/a2c31c75-efbe-4f67-9c37-8f6cde01d72b" />

-   **Affichage en Liste**: Les recettes sont présentées dans une `ListView` personnalisée, affichant une image, un titre et des méta-informations pour chaque pizza.
-   <img width="310" height="584" alt="image" src="https://github.com/user-attachments/assets/72d89b81-e66d-4cb2-af0a-5955d56f4681" />

-   **Vue Détaillée**: Un clic sur une pizza mène à un écran de détail affichant les ingrédients, la description complète et les étapes de préparation.
-   <img width="332" height="610" alt="image" src="https://github.com/user-attachments/assets/fd3b735a-b53c-40dc-8bb6-e82bd58365e4" />




