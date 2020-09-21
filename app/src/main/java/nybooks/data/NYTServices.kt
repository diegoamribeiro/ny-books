package nybooks.data

import nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//   BpRIzdEBOlJndvVYO4TF8Nzi74Mha930
interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "BpRIzdEBOlJndvVYO4TF8Nzi74Mha930",
        @Query("list") list: String = "hardcover-fiction"
    ) : Call<BookBodyResponse>
}