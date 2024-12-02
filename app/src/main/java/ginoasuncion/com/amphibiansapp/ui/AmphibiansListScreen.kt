package ginoasuncion.com.amphibiansapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import ginoasuncion.com.amphibiansapp.R
import ginoasuncion.com.amphibiansapp.model.Amphibian

@Composable
fun AmphibiansListScreen(amphibians: List<Amphibian>, onAmphibianClick: (Amphibian) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.padding_medium))
    ) {
        Text(
            text = stringResource(id = R.string.amphibians_list_title),
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = dimensionResource(id = R.dimen.padding_medium))
        )

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium))
        ) {
            items(amphibians) { amphibian ->
                AmphibianCard(amphibian = amphibian, onClick = { onAmphibianClick(amphibian) })
            }
        }
    }
}
