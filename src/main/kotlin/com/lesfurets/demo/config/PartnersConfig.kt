package com.lesfurets.demo.config

import com.lesfurets.demo.auto.AutoService
import com.lesfurets.demo.auto.AutoServiceImpl
import com.lesfurets.demo.auto.VehiclesMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PartnersConfig {
    @Bean
    fun autoService(): AutoService {
        val mapper = VehiclesMapper.create()
        return AutoServiceImpl(mapper)
    }
}