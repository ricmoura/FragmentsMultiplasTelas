package models

import java.io.Serializable

data class Item(val title: String, val body: String) : Serializable {
    companion object {
        fun fetchAll(): List<Item> {
            return listOf(
                    Item("Cupcake", "Versão 1.0"),
                    Item("Donut", "Versão 1.6"),
                    Item("Eclair", "Versão 2.0/2.1"),
                    Item("Gingerbread", "Versão 2.3"),
                    Item("HoneyComb", "Versão 3.0"),
                    Item("Ice Cream Sandwich", "Versão 4.0"),
                    Item("JellyBeans", "Versão 4.1"),
                    Item("Kit Kat", "Versão 4.4"),
                    Item("Lollipop", "Versão 5"),
                    Item("Marshmellow", "Versão 6"),
                    Item("Nougat", "Versão 7.0/7.1"),
                    Item("Oreo", "Versão 8.0/8.1"),
                    Item("Pie", "Versão 9.0"))
        }
    }

    override fun toString(): String {
        return title
    }
}
