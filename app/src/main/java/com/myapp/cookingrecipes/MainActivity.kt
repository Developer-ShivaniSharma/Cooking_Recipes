package com.myapp.cookingrecipes

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.myapp.cookingrecipes.data.CookingRecipes
import com.myapp.cookingrecipes.ui.theme.CookingRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CookingRecipesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CookingRecipeApp()
                }
            }
        }
    }
}

@Composable
fun CookingRecipeApp(modifier: Modifier = Modifier) {

}

@Composable
fun CookingRecipesDetail(cookingRecipes: CookingRecipes, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier.clip(RoundedCornerShape(16.dp))
    ) {
        Column(modifier = modifier.padding(16.dp)) {
            Text(
                text = stringResource(cookingRecipes.topicRes),
                style = MaterialTheme.typography.displayMedium,
                textDecoration = TextDecoration.Underline,
                fontStyle = FontStyle.Italic

            )
            Image(
                painter = painterResource(cookingRecipes.imageRes),
                contentDescription = null,
                alignment = Alignment.TopCenter
            )
            Text(
                text = stringResource(cookingRecipes.directionsRes),
                style = MaterialTheme.typography.displaySmall
            )
            Text(
                text = stringResource(cookingRecipes.recipeRes),
                style = MaterialTheme.typography.bodyLarge,


            )
        }
    }

}
@Composable
fun CookingRecipesList(cookingRecipesList:List<CookingRecipes>,modifier: Modifier=Modifier){
    LazyColumn(modifier = modifier.padding(16.dp)){
        items(cookingRecipesList){cookingRecipes->
            CookingRecipesDetail(cookingRecipes = cookingRecipes, modifier = Modifier.padding(8.dp) )

        }
    }

}
@Preview("Dark Theme")
@Composable
fun CookingRecipesDetailPreview() {
    CookingRecipesTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier,
        ) {
            CookingRecipesDetail(
                cookingRecipes =
                CookingRecipes(
                    R.drawable.brownies,
                    R.string.topic1,
                    R.string.directions,
                    R.string.directions1
                )
            )

        }
    }
}
@Preview
@Composable
fun CookingRecipesListPreview() {
    CookingRecipesTheme (darkTheme = true){
        CookingRecipesList(
            cookingRecipesList =
            listOf(
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
                    imageRes = R.drawable.fruitchaat,
                    topicRes = R.string.topic5,
                    directionsRes = R.string.directions,
                    recipeRes = R.string.directions5,
                ),
                CookingRecipes(
                    imageRes = R.drawable.healthyfood,
                    topicRes = R.string.topic6,
                    directionsRes = R.string.directions,
                    recipeRes = R.string.directions6,
                ),
                CookingRecipes(
                    imageRes = R.drawable.mexican_corn_salad,
                    topicRes = R.string.topic7,
                    directionsRes = R.string.directions,
                    recipeRes = R.string.directions7,
                ),
                CookingRecipes(
                    imageRes = R.drawable.pakora,
                    topicRes = R.string.topic8,
                    directionsRes = R.string.directions,
                    recipeRes = R.string.directions8,
                ),
                CookingRecipes(
                    imageRes = R.drawable.pasta,
                    topicRes = R.string.topic9,
                    directionsRes = R.string.directions,
                    recipeRes = R.string.directions9,
                ),
                CookingRecipes(
                    imageRes = R.drawable.thai_green_curry,
                    topicRes = R.string.topic10,
                    directionsRes = R.string.directions,
                    recipeRes = R.string.directions10,
                )
            )
        )
    }
}