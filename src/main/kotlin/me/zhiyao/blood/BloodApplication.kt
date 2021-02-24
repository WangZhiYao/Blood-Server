package me.zhiyao.blood

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BloodApplication

fun main(args: Array<String>) {
    runApplication<BloodApplication>(*args)
}
