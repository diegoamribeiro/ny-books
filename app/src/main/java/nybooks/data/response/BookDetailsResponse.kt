package nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import nybooks.data.model.Book

@JsonClass(generateAdapter = true)
data class BookDetailsResponse (
    @Json(name = "title")
    val title: String,

    @Json(name = "author")
    val author: String,

    @Json(name = "description")
    val description: String
){
    fun getBooksModel() = Book(
        title = this.title,
        author = this.author,
        description = this.description
    )
}