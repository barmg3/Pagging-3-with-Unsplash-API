package com.barmge.paging3withunsplash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.paging.ExperimentalPagingApi
import com.barmge.paging3withunsplash.navigation.SetupNavGraph
import com.barmge.paging3withunsplash.ui.theme.Paging3WithUnsplashTheme
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalPagingApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Paging3WithUnsplashTheme {

                val navController = rememberNavController()
                SetupNavGraph(navController = navController)

                }
            }
        }
    }
