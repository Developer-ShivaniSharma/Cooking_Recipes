package com.myapp.cookingrecipes

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
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
@Preview("Light Theme")
@Composable
fun CookingRecipesDetailPreview2() {
    CookingRecipesTheme(darkTheme = false) {
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