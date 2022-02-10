package com.drawutil.drawingutil.helpers

import java.util.logging.Logger

object DrawLogger {

    val loggel: Logger = Logger.getLogger(this::class.java.name)

    fun log(text: String) {
        loggel.info(text)
    }

}