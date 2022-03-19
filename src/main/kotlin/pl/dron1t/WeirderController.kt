package pl.dron1t

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject
import pl.dron1t.models.RequestBody
import pl.dron1t.models.ResponseBody
import pl.dron1t.services.WeirderService

@Controller("/weirder")
class WeirderController @Inject constructor(private val weirderService: WeirderService) {

    @Post(uri = "/", produces = [MediaType.APPLICATION_JSON], consumes = [MediaType.APPLICATION_JSON])
    fun index(@Body body: RequestBody): ResponseBody {
        return ResponseBody(weirderService.doWeirding(body.message))
    }
}