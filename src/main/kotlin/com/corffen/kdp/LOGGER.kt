package com.corffen.kdp

object LOGGER {
    fun info(msg: String, place: String? = null) {
        if (!place.isNullOrBlank()) {
            println(msg.replace("{}", place))
        } else {
            println(msg)
        }
    }

    fun error(msg: String) {
        System.err.println(msg)
    }
}
