package com.vajahatalee.apm

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class ApmApplication {
    @GetMapping("/api")
    fun createLogs(): ResponseEntity<String> {
        logger.warn("In the createLogs")
        return ResponseEntity.ok().body("All FINE")
    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(ApmApplication::class.java)

        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(ApmApplication::class.java, *args)
        }
    }
}
