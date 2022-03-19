package pl.dron1t.services

import jakarta.inject.Singleton

@Singleton
class WeirderService {

    fun doWeirding(message: String) : String {
        var msg = message.split("[\\W]]").toMutableList();
        msg.shuffle();
        return msg.toList().joinToString()
    }
}