package me.zhiyao.blood.ext

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
inline fun <reified T> T.logger(): Logger {
    return LoggerFactory.getLogger(T::class.java)
}