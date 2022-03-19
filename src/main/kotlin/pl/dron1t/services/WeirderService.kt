package pl.dron1t.services

import jakarta.inject.Singleton

@Singleton
class WeirderService {

    private val regex: Regex = "[\\W]".toRegex()

    fun doWeirding(message: String) : String {
        val msg = message.split(regex).toMutableList()
        msg.shuffle()
        return msg.toList().joinToString(" ")
    }
}