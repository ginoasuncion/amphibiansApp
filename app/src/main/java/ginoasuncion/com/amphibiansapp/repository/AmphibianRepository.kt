package ginoasuncion.com.amphibiansapp.repository

import ginoasuncion.com.amphibiansapp.model.Amphibian
import ginoasuncion.com.amphibiansapp.network.AmphibianApi

class AmphibianRepository {
    suspend fun getAmphibians(): List<Amphibian> {
        return AmphibianApi.retrofitService.getAmphibians()
    }
}
