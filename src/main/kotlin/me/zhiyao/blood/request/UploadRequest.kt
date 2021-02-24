package me.zhiyao.blood.request

import me.zhiyao.blood.dao.model.BloodPressure

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
data class UploadRequest(
    val bloodPressureList: List<BloodPressure>
)
