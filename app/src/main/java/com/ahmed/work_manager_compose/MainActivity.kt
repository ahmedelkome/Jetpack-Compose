package com.ahmed.work_manager_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmed.work_manager_compose.ui.theme.Work_manager_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.me)
            val description = "Ahmed elkomy y regala"
            val title = "Ahmed ibrahim zaki nassar elkomy"
            Box(modifier = Modifier.fillMaxWidth(0.5f)
                .padding(16.dp)){
                ImageCard(painter = painter, imagedescription =description , title = title)

            }
        }
    }
}
@Composable
fun ImageCard(
    painter : Painter,
    imagedescription : String,
    title : String,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier.fillMaxWidth()
    , shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(modifier = modifier.height(200.dp)){
            Image(painter = painter,
                contentDescription =imagedescription
            , contentScale = ContentScale.Crop)
        Box(modifier = modifier
            .fillMaxSize()
            .padding(12.dp)
        , contentAlignment = Alignment.BottomStart)
        {
            Text(title, style = TextStyle(color = Color.White , fontSize = 16.sp))
        }
        }
    }
}