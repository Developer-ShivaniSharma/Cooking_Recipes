package com.myapp.cookingrecipes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CookingRecipes(
   @DrawableRes val imageRes:Int,
    @StringRes val topicRes:Int,
    @StringRes val  directionsRes:Int,
    @StringRes val recipeRes:Int
)
