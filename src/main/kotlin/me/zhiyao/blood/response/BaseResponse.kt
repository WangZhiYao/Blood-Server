package me.zhiyao.blood.response

import me.zhiyao.blood.constant.ResponseCode

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
sealed class BaseResponse(
    open val code: Int,
) {

    class Success<T>(val data: T?) : BaseResponse(ResponseCode.SUCCESS)

    data class Error(override val code: Int) : BaseResponse(code)
}

