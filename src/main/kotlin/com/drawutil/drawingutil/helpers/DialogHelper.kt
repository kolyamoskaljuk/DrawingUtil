package com.drawutil.drawingutil.helpers

import javafx.scene.control.Alert
import javafx.scene.control.Alert.AlertType


class DialogHelper {

    fun showDrawFigureDialog() {
        val alert = Alert(AlertType.INFORMATION)
        alert.title = "Test Connection"
        alert.headerText = "Results:"
        alert.contentText = "Connect to the database successfully!"

        alert.showAndWait()
    }

}