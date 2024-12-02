package ginoasuncion.com.amphibiansapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ginoasuncion.com.amphibiansapp.ui.AmphibiansApp
import ginoasuncion.com.amphibiansapp.viewmodel.AmphibianViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: AmphibianViewModel = viewModel()
            AmphibiansApp(viewModel = viewModel)
        }
    }
}
