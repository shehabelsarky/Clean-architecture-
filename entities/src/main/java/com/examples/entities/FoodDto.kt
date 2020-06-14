package com.examples.entities

import com.google.gson.annotations.SerializedName

data class FoodDto(
        @SerializedName("results") val results: ArrayList<com.examples.entities.Food>
)