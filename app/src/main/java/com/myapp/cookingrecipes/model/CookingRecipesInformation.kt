package com.myapp.cookingrecipes.model

import com.myapp.cookingrecipes.R
import com.myapp.cookingrecipes.data.CookingRecipes

object CookingRecipesInformation {
    val cookingRecipe = listOf(
        CookingRecipes(
            imageRes = R.drawable.brownies,
            topicRes = R.string.topic1,
            directionsRes = R.string.directions,
            recipeRes = R.string.directions1,
        ),
        CookingRecipes(
            imageRes = R.drawable.cake,
            topicRes = R.string.topic2,
            directionsRes = R.string.directions,
            recipeRes = R.string.directions2,
        ),
        CookingRecipes(
            imageRes = R.drawable.choclate_cookies,
            topicRes = R.string.topic3,
            directionsRes = R.string.directions,
            recipeRes = R.string.directions3,
        ),
        CookingRecipes(
            imageRes = R.drawable.chokochip_cake,
            topicRes = R.string.topic4,
            directionsRes = R.string.directions,
            recipeRes = R.string.directions4,
        ),
        CookingRecipes(
            imageRes =R.drawable.fruitchaat,
            topicRes =R.string.topic5,
            directionsRes = R.string.directions,
            recipeRes =R.string.directions5,
        ),
        CookingRecipes(
            imageRes =R.drawable.healthyfood,
            topicRes =R.string.topic6,
            directionsRes = R.string.directions,
            recipeRes =R.string.directions6,
        ),
        CookingRecipes(
            imageRes =R.drawable.mexican_corn_salad,
            topicRes =R.string.topic7,
            directionsRes = R.string.directions,
            recipeRes =R.string.directions7,
        ),
        CookingRecipes(
            imageRes =R.drawable.pakora,
            topicRes =R.string.topic8,
            directionsRes = R.string.directions,
            recipeRes =R.string.directions8,
        ),
        CookingRecipes(
            imageRes =R.drawable.pasta,
            topicRes =R.string.topic9,
            directionsRes = R.string.directions,
            recipeRes =R.string.directions9,
        ),
        CookingRecipes(
            imageRes =R.drawable.thai_green_curry,
            topicRes =R.string.topic10,
            directionsRes = R.string.directions,
            recipeRes =R.string.directions10,
        )
    )
}