package com.richdevelop.weather_api.repository.room.entitys

import androidx.room.TypeConverters
import com.richdevelop.weather_api.repository.room.converters.Converter

data class Wind(
    @TypeConverters(Converter::class)
    val speed: Double
)