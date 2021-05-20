package com.lesfurets.demo.auto

import java.util.UUID

typealias AutoId = UUID

data class Auto(
        val id: AutoId,
        val mark: String,
        val doors: List<AutoDoor>
)

data class AutoDoor(
    val color: String
)