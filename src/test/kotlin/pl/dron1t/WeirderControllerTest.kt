package pl.dron1t

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpRequest.POST
import io.micronaut.http.HttpResponse
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import pl.dron1t.models.RequestBody
import pl.dron1t.models.ResponseBody

@MicronautTest
class WeirderControllerTest {

    @Inject
    @field:Client("/")
    lateinit var client : HttpClient

    @BeforeEach

    @Test
    internal fun testWeirder() {
        val request: HttpRequest<RequestBody> = POST("/weirder", RequestBody("abc"))
        val body: HttpResponse<ResponseBody> = client!!.toBlocking().exchange(request, ResponseBody::class.java)
        assertNotNull(body.body())
        assertEquals("abc", body.body().message)
    }
}