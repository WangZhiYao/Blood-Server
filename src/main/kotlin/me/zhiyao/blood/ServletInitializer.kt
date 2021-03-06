package me.zhiyao.blood

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
class ServletInitializer : SpringBootServletInitializer() {

    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(BloodApplication::class.java)
    }

}
