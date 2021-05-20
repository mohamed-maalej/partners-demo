package com.lesfurets.demo.auto

class VehiclesMapper(private val mapper: VehicleMapper) {
    fun map(autos: List<Auto>): Vehicles {
        return Vehicles(
            vehicles = autos.map { auto -> mapper.map(auto) }
        )
    }

    companion object {
        fun create(): VehiclesMapper {
            val doorsMapper = DoorsMapper(DoorMapper())
            val vehicleMapper = VehicleMapper(doorsMapper)
            return VehiclesMapper(vehicleMapper)
        }
    }
}

class VehicleMapper(private val mapper: DoorsMapper) {
    fun map(auto: Auto): Vehicle {
        return Vehicle(
            id = auto.id,
            model = auto.mark,
            doors = mapper.map(auto.doors)
        )
    }
}

class DoorsMapper(private val mapper: DoorMapper) {
    fun map(doors: List<AutoDoor>): List<Door> {
        return doors.map { door -> mapper.map(door) }
    }
}

class DoorMapper {
    fun map(door: AutoDoor): Door {
        return Door(
            color = door.color
        )
    }
}