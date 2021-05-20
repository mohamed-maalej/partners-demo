package com.lesfurets.demo.auto

data class Vehicles(
    val vehicles: List<Vehicle>
)

data class Vehicle(
        val id: AutoId,
        val model: String,
        val doors: List<Door>
)

data class Door(
    val color: String
)