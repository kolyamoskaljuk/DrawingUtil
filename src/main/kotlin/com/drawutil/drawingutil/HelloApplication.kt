package com.drawutil.drawingutil

import com.drawutil.drawingutil.controllers.MenuController
import com.drawutil.drawingutil.helpers.DialogHelper
import com.drawutil.drawingutil.helpers.DrawLogger
import com.drawutil.drawingutil.models.Circle
import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.canvas.Canvas
import javafx.scene.input.MouseEvent
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloApplication : Application() {

    private val dialogHelper = DialogHelper()

    override fun start(stage: Stage) {

        val root = VBox()
        val scene = Scene(root, 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene

        val menuBar = MenuController(stage).createMenu()
        val canvas = Canvas(300.0, 200.0)
        canvas.onMouseClicked = EventHandler { event: MouseEvent ->
            dialogHelper.showDrawFigureDialog()
        }
        //add menu bar to main view
        root.children.addAll(menuBar, canvas, MenuController(stage).createMenu())

        val holder = FigureHolder()

        val callback = {
            val items = holder.getFigures()
            DrawLogger.log(items.toString())
        }

        holder.callback = callback

        holder.add(Circle(10.0f))

        val circle = Circle(10.0f)
        holder.add(circle)
        holder.remove(circle)

        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}