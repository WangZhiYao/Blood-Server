package me.zhiyao.blood.dao.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import me.zhiyao.blood.dao.mapper.BloodPressureMapper
import me.zhiyao.blood.dao.model.BloodPressure
import me.zhiyao.blood.dao.service.BloodPressureService
import org.springframework.stereotype.Service

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
@Service
class BloodPressureServiceImpl : BloodPressureService, ServiceImpl<BloodPressureMapper, BloodPressure>()