package com.lesfurets.demo.auto

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AutoController @Autowired constructor(
    private val service: AutoService
) {

    @GetMapping("/vehicles")
    fun getAll(): ResponseEntity<Vehicles> {
        val products = service.getAll()
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(products)
    }
}