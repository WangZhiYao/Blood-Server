package me.zhiyao.blood

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
@SpringBootApplication
class BloodApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<BloodApplication>(*args)
        }
    }
}
