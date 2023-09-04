package com.corffen.kdp.composite

import com.corffen.kdp.LOGGER

fun main() {
    LOGGER.info("Message from the orcs:")
    val orcMessage = Messenger().messageFromOrcs()
    orcMessage.print()

    LOGGER.info("\nMessage from the elves:")
    val elfMessage = Messenger().messageFromElves()
    elfMessage.print()
}
