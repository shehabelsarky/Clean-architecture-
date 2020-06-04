package com.architecture.clean.domain.model

import com.architecture.clean.domain.model.Food
import com.google.gson.annotations.SerializedName

data class FoodBO(
        @SerializedName("results") val results: ArrayList<Food>
)