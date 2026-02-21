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
-   **Affichage en Liste**: Les recettes sont présentées dans une `ListView` personnalisée, affichant une image, un titre et des méta-informations pour chaque pizza.
-   **Vue Détaillée**: Un clic sur une pizza mène à un écran de détail affichant les ingrédients, la description complète et les étapes de préparation.
-   **Action de Partage**: Une option dans la barre de menu permet de partager l'application via d'autres applications.

## Démarche de Refactoring

Afin de garantir l'originalité du code et d'en améliorer la qualité, une refactorisation complète a été effectuée. L'ensemble des noms de variables, de méthodes et de certains paramètres ont été renommés pour être plus explicites et pour suivre les conventions de nommage standard de la communauté Java/Android.

## Comment Lancer le Projet

1.  Ouvrez le projet avec Android Studio.
2.  Lancez une synchronisation Gradle si nécessaire.
3.  Exécutez l'application sur un émulateur ou un appareil Android connecté.
