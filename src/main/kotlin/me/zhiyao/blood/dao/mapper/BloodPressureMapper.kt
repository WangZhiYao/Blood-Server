package me.zhiyao.blood.dao.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import me.zhiyao.blood.dao.model.BloodPressure
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
@Mapper
@Repository
interface BloodPressureMapper : BaseMapper<BloodPressure>