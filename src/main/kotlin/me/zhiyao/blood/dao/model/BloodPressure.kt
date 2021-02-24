package me.zhiyao.blood.dao.model

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.fasterxml.jackson.annotation.JsonIgnore

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
data class BloodPressure(
    @JsonIgnore
    @TableId(type = IdType.AUTO)
    var id: Long?,
    val sys: Int,
    val dia: Int,
    val pul: Int,
    val measureTime: Long,
    val createTime: Long,
    @JsonIgnore
    var uploadTime: Long?
)
