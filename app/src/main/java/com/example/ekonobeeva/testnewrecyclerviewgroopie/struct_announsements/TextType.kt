package com.example.ekonobeeva.testnewrecyclerviewgroopie.struct_announsements

/**
 * Created by e.konobeeva on 29.12.2017.
 */
data class TextType(var textContent : String,   var textType : TEXT_TYPES, var textColor: String) {
}

enum class TEXT_TYPES{
    TITLE,
    SUBTITLE,
    USUAL_TEXT
}