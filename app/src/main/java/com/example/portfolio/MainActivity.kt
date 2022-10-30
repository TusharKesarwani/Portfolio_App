package com.example.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portfolio.ui.theme.PortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortfolioTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    PortfolioApp()
                }
            }
        }
    }
}

@Composable
fun PortfolioText() {
    ArticleCard(
        title = "Tushar Kesarwani",
        shortDescription = "Problem Setter Intern at iMocha || 4 \uD83C\uDF1F at CodeChef(max 1892) || Pupil at Codeforces(max 1214) || Coding Enthusiast\uD83D\uDC68\u200D\uD83D\uDCBB || Front-End Developer || Malviyan\uD83D\uDC68\u200D\uD83C\uDF93 || Student at Madan Mohan Malaviya University of Technology",
        longDescription = "♦I'm currently studying at Madan Mohan Malaviya University of Technology, Gorakhpur.\n" +
                "♦I'm currently working as a Problem Setter - Coding Intern in iMocha.\n" +
                "♦I worked as a doubt solver in CodeChef.\n" +
                "♦I'm a quick learner, coding enthusiast, and also a competitive programmer.\n" +
                "♦I'm currently a Front-End Developer and exploring the field of Development through doing projects.\n" +
                "♦I'm also active in the Competitive Programming field and I also secured various good ranks in different contests.",
        imagePainter = painterResource(R.drawable.profilepic)
    )
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = shortDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = longDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun PortfolioApp() {
    val image = painterResource(R.drawable.background)
    //Step 3 create a box to overlap image and texts
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        PortfolioText()
    }
}

@Preview(showBackground = true)
@Composable
fun PortfolioAppPreview() {
    PortfolioTheme {
        Surface {
            PortfolioApp()
        }
    }
}