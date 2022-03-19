package pl.dron1t

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import pl.dron1t.models.RequestBody
import pl.dron1t.models.ResponseBody
import pl.dron1t.services.WeirderService

@Controller("/weirder")
class WeirderController @Inject constructor(private val weirderService: WeirderService) {

    private val logger: Logger = LoggerFactory.getLogger(WeirderController::class.java)

    @Post(uri = "/", produces = [MediaType.APPLICATION_JSON], consumes = [MediaType.APPLICATION_JSON])
    fun index(@Body body: RequestBody): ResponseBody {
        logger.info("index was {}", "requested")
        return ResponseBody(weirderService.doWeirding(body.message))
    }
}