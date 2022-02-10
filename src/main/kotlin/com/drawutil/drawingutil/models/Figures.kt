package com.drawutil.drawingutil.models

abstract class Figure {

    abstract fun calculateSquare(): Double

    abstract fun calculatePerimeter(): Double

}

//interface

class Circle constructor(var radius: Float) : Figure() {


    override fun calculateSquare(): Double {
        return Math.pow(radius * 2 * 3.14, 2.0)
    }

    override fun calculatePerimeter(): Double {
        return radius * 2 * 3.14
    }

    override fun toString(): String {
        return "Circle " + radius
    }

}

class Rectangle constructor(val h: Double, val w: Double) : Figure() {


    override fun calculateSquare(): Double {
        return h * w
    }

    override fun calculatePerimeter(): Double {
        return h * 2 + w * 2
    }

}