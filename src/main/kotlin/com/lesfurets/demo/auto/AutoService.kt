package com.lesfurets.demo.auto

import java.util.UUID


interface AutoService {
    fun getAll(): Vehicles
}

class AutoServiceImpl(private val mapper: VehiclesMapper) : AutoService {

    override fun getAll(): Vehicles {
        return mapper.map(autos)
    }

    companion object {
        private val autos = listOf(
            Auto(
                id = UUID.randomUUID(),
                mark = "Renault",
                doors = listOf(
                    AutoDoor(
                        color = "white"
                    ),
                    AutoDoor(
                        color = "black"
                    )
                )
            )
        )
    }
}