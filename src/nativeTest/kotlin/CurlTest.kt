import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.utils.io.core.*
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals

class CurlTest {
    @Test
    fun test() {
        runBlocking {
            HttpClient().use { client ->
                val response = client.get("http://example.com")
                assertEquals(response.status, HttpStatusCode.OK)
            }
        }
    }
}