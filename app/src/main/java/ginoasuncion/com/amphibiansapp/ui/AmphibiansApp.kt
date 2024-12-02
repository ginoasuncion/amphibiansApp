package ginoasuncion.com.amphibiansapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import ginoasuncion.com.amphibiansapp.viewmodel.AmphibianViewModel

@Composable
fun AmphibiansApp(viewModel: AmphibianViewModel) {
    val amphibians by viewModel.amphibians

    AmphibiansListScreen(amphibians = amphibians) { amphibian ->
    }
}
