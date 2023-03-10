package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAppScreen()
        }
    }
}


@Composable
fun MainAppScreen() {
    ComposeTheme {
        Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
        ){
            SaudarUsuarioLogado("Lucas Pereira Carvalho")
        }

    }
}

@Composable
fun SaudarUsuarioLogado(nomeDoUsuarioLogado: String){
    Column {
        Text(text = "Oie, $nomeDoUsuarioLogado!")
        Text("Tudo bom?")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPrev() {
    MainAppScreen()
}