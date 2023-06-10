package br.com.fooddeliveryapp.features.home.impl.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column {
        TopBar()
        Text(text = "Delicious")
        Text(text = "Food Menu")
        SearchBar()
        CategoryList()
        PopularList()
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        IconButton(onClick = { }) {
            Icon(Icons.Default.Menu, "")
        }
        IconButton(onClick = { }) {
            Icon(Icons.Outlined.Notifications, "")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf("") }

    OutlinedTextField(
        value = searchText,
        onValueChange = { searchText = it },
        label = {
            Text("Search...")
        }
    )
}

@Composable
fun CategoryList() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ){
        items(5) { index ->
            Card {
                Text(text = "Card")
            }
        }
    }
}

@Composable
fun PopularList() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 128.dp)
    ){
        items(5) { index ->
            Card {
                Text(text = "Plate")
            }
        }
    }
}

