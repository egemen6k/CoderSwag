package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Products

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Products("Devslopes Graphic Beanie","$18","hat1"),
        Products("Devslopes Hat Black","$20","hat2"),
        Products("Devslopes Hat White","$18","hat3"),
        Products("Devslopes Hat Snapback ","$22","hat4")
    )

    val hoodies = listOf(
        Products("Devslopes Hoodie Gray","$28","hoodie1"),
        Products("Devslopes Hoodie Red","$32","hoodie2"),
        Products("Devslopes Gray Hoodie","$28","hoodie3"),
        Products("Devslopes Black Hoodie","$28","hoodie4")
    )

    val shirts = listOf(
        Products("Devslopes Shirt Black","$18","shirt1"),
        Products("Devslopes Badge Light Gray","$20","shirt2"),
        Products("Devslopes Logo Shirt Red","$22","shirt3"),
        Products("Devslopes Hustle","$22","shirt4"),
        Products("Kickflip Studios","$18","shirt5")
    )

    val digitalGoods = listOf<Products>()

    fun getProducts(category: String): List<Products>{

        return when(category){
            "Shirts" -> shirts
            "Hats"  -> hats
            "Hoodies" -> hoodies
            else -> digitalGoods
        }

    }
}