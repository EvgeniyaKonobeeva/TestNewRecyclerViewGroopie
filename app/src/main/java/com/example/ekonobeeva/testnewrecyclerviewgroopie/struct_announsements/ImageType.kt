package com.example.ekonobeeva.testnewrecyclerviewgroopie.struct_announsements

/**
 * Created by e.konobeeva on 29.12.2017.
 */
data class ImageType(var type : IMAGE_TYPES, var url:String, var sizeHeight : Int, var sizeWidth : Int) {

}

enum class IMAGE_TYPES{ // примерно, скорее всего надо изменить
    FUll_CELL,
    FULL_SCREEN,
    SMALL_CENTER
}