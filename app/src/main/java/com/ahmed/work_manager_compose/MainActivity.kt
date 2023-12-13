package com.ahmed.work_manager_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontfamily = FontFamily(
            Font(R.font.lexend_thin, FontWeight.Thin),
            Font(R.font.lexend_black, FontWeight.Black),
            Font(R.font.lexend_medium, FontWeight.Medium),
            Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
            Font(R.font.lexend_extralight, FontWeight.ExtraLight),
            Font(R.font.lexend_light, FontWeight.Light),
            Font(R.font.lexend_bold, FontWeight.Bold)
        )
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))){
                Text(text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green
                            , fontSize = 50.sp,
                            textDecoration = TextDecoration.None
                        )
                    ){
                        append("J")
                    }
                    append("etpack")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Blue
                            , fontSize = 50.sp
                            , textDecoration = TextDecoration.None
                        )
                    ){
                        append("C")
                    }
                    append("ompose")
                }
                , color = Color.White
                    , fontSize = 30.sp,
                    fontFamily = fontfamily,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold
                    , textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}

