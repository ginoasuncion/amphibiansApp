package ginoasuncion.com.amphibiansapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import ginoasuncion.com.amphibiansapp.model.Amphibian
import ginoasuncion.com.amphibiansapp.repository.AmphibianRepository

class AmphibianViewModel(
    private val repository: AmphibianRepository = AmphibianRepository()
) : ViewModel() {

    private val _amphibians = mutableStateOf<List<Amphibian>>(emptyList())
    val amphibians: State<List<Amphibian>> = _amphibians

    init {
        fetchAmphibians()
    }

    fun fetchAmphibians() {
        viewModelScope.launch {
            try {
                _amphibians.value = repository.getAmphibians()
            } catch (e: Exception) {
                println("Error fetching amphibians: ${e.message}")
            }
        }
    }
}
