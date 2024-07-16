package com.example.countermvvm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CounterScreen(
    viewModel: CounterViewModel,
) {


    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "CounterScreen") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Count: ${viewModel.count.value}",
                fontSize = 24.sp
            )
            Row {
                Button(onClick = { viewModel.incrementCounter() }) {
                    Text(text = "Increment")
                }
                Button(onClick = { viewModel.decrementCounter() }) {
                    Text(text = "Decrement")
                }
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun CounterScreenPreview() {
    val viewModel : CounterViewModel = viewModel()
    CounterScreen(viewModel)
}