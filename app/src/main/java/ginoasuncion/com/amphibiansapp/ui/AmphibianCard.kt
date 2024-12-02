package ginoasuncion.com.amphibiansapp.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import coil.compose.AsyncImage
import ginoasuncion.com.amphibiansapp.R
import ginoasuncion.com.amphibiansapp.model.Amphibian

@Composable
fun AmphibianCard(amphibian: Amphibian, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.padding_small))
            .clickable { onClick() },
        shape = RoundedCornerShape(dimensionResource(id = R.dimen.padding_small))
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(
                model = amphibian.imgSrc,
                contentDescription = stringResource(id = R.string.no_image_description),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(id = R.dimen.image_height)),
                contentScale = androidx.compose.ui.layout.ContentScale.Crop
            )
            Text(
                text = "${amphibian.name} (${amphibian.type})",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = dimensionResource(id = R.dimen.padding_medium),
                        top = dimensionResource(id = R.dimen.padding_small),
                        end = dimensionResource(id = R.dimen.padding_medium),
                        bottom = dimensionResource(id = R.dimen.padding_zero),
                    )
            )
            Text(
                text = amphibian.description,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = dimensionResource(id = R.dimen.padding_medium),
                        top = dimensionResource(id = R.dimen.padding_small),
                        end = dimensionResource(id = R.dimen.padding_medium),
                        bottom = dimensionResource(id = R.dimen.padding_medium)
                    )
            )
        }
    }
}
