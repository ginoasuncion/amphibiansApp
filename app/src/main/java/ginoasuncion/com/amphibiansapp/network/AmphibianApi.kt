package ginoasuncion.com.amphibiansapp.network

import retrofit2.http.GET
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ginoasuncion.com.amphibiansapp.model.Amphibian

interface AmphibianApiService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}

object AmphibianApi {
    val retrofitService: AmphibianApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://android-kotlin-fun-mars-server.appspot.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AmphibianApiService::class.java)
    }
}
