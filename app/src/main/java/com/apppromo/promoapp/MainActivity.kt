package com.apppromo.promoapp


import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.apppromo.promoapp.ui.component.AppNavigationGraph
import com.apppromo.promoapp.ui.theme.PromoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PromoAppTheme {

                AppEntryPoint()
                }
            }
        }
    }


@Composable
fun AppEntryPoint(){
    AppNavigationGraph()
}
