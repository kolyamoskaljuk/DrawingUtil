package com.drawutil.drawingutil

import com.drawutil.drawingutil.helpers.DrawLogger
import com.drawutil.drawingutil.models.Figure

class FigureHolder {

    private val figures = ArrayList<Figure>()

    var item: String = ""

    var callback: () -> Unit = {}

    fun add(figure: Figure) {
        DrawLogger.log("FigureHolder add")
        figures.add(figure)
        callback()
    }

    fun remove(figure: Figure) {
        DrawLogger.log("FigureHolder remove")
        figures.remove(figure)
        callback()
    }

    fun clear() {
        DrawLogger.log("FigureHolder clear")
        figures.clear()
        callback()
    }

    fun getFigures(): List<Figure> {
        return figures
    }

}