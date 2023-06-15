package br.com.fooddeliveryapp.features.home.impl.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.fooddeliveryapp.design_system.theme.AppTheme
import br.com.fooddeliveryapp.design_system.theme.Padding
import br.com.fooddeliveryapp.design_system.theme.Shape
import br.com.fooddeliveryapp.design_system.theme.TextStyle

@Composable
fun HomeScreen() {
    val verticalScrollState = rememberScrollState()
    AppTheme {
        Surface {
            Column {
                Column(
                    modifier = Modifier.verticalScroll(scrollState)
                ) {
                    TopBar()
                    Text(
                        text = "Delicious",
                        style = TextStyle.body,
                        modifier = Modifier.padding(
                            horizontal = Padding.medium,
                            vertical = Padding.normal
                        )
                    )
                    Text(
                        text = "Food Menu",
                        style = TextStyle.h1,
                        modifier = Modifier.padding(
                            horizontal = Padding.medium,
                            vertical = Padding.normal
                        )
                    )
                }
                SearchBar()
                CategoryList()
                PopularList()
            }
        }
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
    Column {
        Text(
            text = "Category",
            style = TextStyle.h2,
            modifier = Modifier.padding(horizontal = Padding.medium, vertical = Padding.normal)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            contentPadding = PaddingValues(Padding.normal)
        ) {
            items(5) {
                Column(
                    modifier = Modifier
                        .clip(Shape.card)
                        .background(Color.Red)
                        .clickable {
                            // TODO
                        },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        Icons.Default.Notifications,
                        contentDescription = null,
                        modifier = Modifier.padding(
                            start = Padding.large,
                            top = Padding.large,
                            end = Padding.large,
                        )
                    )
                    Text(
                        text = "Card",
                        modifier = Modifier.padding(
                            start = Padding.large,
                            bottom = Padding.large,
                            end = Padding.large,
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun PopularList() {
    Column {
        Text(
            text = "Most Popular",
            style = TextStyle.h2,
            modifier = Modifier.padding(horizontal = Padding.medium, vertical = Padding.normal)
        )
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp)
        ) {
            items(15) {
                Column(
                    modifier = Modifier
                        .clip(Shape.card)
                        .background(Color.Red)
                        .clickable {
                            // TODO
                        },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        Icons.Default.Notifications,
                        contentDescription = null,
                        modifier = Modifier.padding(
                            start = Padding.large,
                            top = Padding.large,
                            end = Padding.large,
                        )
                    )
                    Text(
                        text = "Card",
                        modifier = Modifier.padding(
                            start = Padding.large,
                            bottom = Padding.large,
                            end = Padding.large,
                        )
                    )
                }
            }
        }
    }
}

