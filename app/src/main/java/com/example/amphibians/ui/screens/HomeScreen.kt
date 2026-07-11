package com.example.amphibians.ui.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.amphibians.R
import com.example.amphibians.ui.theme.AmphibiansTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    // TODO
}

@Composable
fun AmphibianCard(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.padding(8.dp)
    ) {
        Column {
            AmphibianTitle(
                R.string.name,
                R.string.type
            )
            Image(
                painter = painterResource(R.drawable.great_basin_spadefoot),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = stringResource(R.string.description),
                modifier = Modifier.padding(15.dp)
            )
        }
    }
}

@Composable
fun AmphibianTitle(
    @StringRes title: Int,
    @StringRes type: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth().padding(8.dp)
    ) {
        Text(
            text = stringResource(title),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = " (${stringResource(type)})",
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun AmphibianGridScreen(
    modifier: Modifier = Modifier
) {
    // TODO: Create Grid
}

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    // TODO
}

@Composable
fun ErrorScreen(modifier: Modifier = Modifier) {
    // TODO
}

@Preview(showBackground = true)
@Composable
fun AmphibianCardPreview() {
    AmphibiansTheme {
        AmphibianCard()
    }
}