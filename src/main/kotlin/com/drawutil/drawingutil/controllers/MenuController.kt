package com.drawutil.drawingutil.controllers

import javafx.scene.control.Menu
import javafx.scene.control.MenuBar
import javafx.scene.control.MenuItem
import javafx.stage.Stage

class MenuController(private val stage: Stage) {

    fun createMenu(): MenuBar {
        //menu view
        val menuBar = MenuBar()

        //parent menu item
        val fileMenu = Menu("File")

        //children
        val menuItemNew = MenuItem("New")
        menuItemNew.setOnAction { stage.close() }
        val menuItemOpen = MenuItem("Open")

        //add children to parent
        fileMenu.items.addAll(menuItemNew, menuItemOpen)

        //add menu items to menuBar
        menuBar.menus.addAll(fileMenu)

        return menuBar
    }

}