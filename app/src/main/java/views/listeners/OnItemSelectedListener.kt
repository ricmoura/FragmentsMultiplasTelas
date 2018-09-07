package views.listeners

import models.Item

interface OnItemSelectedListener {
    fun onItemSelected(i: Item?)
}