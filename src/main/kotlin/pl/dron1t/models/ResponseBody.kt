package pl.dron1t.models

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class ResponseBody(val message: String)
