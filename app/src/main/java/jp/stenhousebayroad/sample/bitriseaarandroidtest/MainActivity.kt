package jp.stenhousebayroad.sample.bitriseaarandroidtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import jp.stenhousebayroad.sample.bitriseaarandroidtest.ui.theme.BitriseAarAndroidTestTheme
import jp.stenhousebayroad.sample.mylibrary.LibrarySample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BitriseAarAndroidTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    // ここでライブラリの関数を呼ぶ
    Text(text = "${LibrarySample.hello()} $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BitriseAarAndroidTestTheme {
        Greeting("Android")
    }
}