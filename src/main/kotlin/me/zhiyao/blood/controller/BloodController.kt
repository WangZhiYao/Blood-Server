package me.zhiyao.blood.controller

import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import me.zhiyao.blood.constant.ResponseCode
import me.zhiyao.blood.dao.model.BloodPressure
import me.zhiyao.blood.dao.service.BloodPressureService
import me.zhiyao.blood.ext.logger
import me.zhiyao.blood.request.UploadRequest
import me.zhiyao.blood.response.BaseResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime
import java.time.ZoneOffset

/**
 *
 * @author WangZhiYao
 * @date 2021/2/24
 */
@RestController
@RequestMapping("/v1", produces = ["application/json;charset=utf-8"])
class BloodController(private val bloodPressureService: BloodPressureService) {

    @PostMapping("/upload")
    suspend fun upload(@RequestBody uploadRequest: UploadRequest): ResponseEntity<BaseResponse> {
        try {
            val bloodPressureList = uploadRequest.bloodPressureList
            bloodPressureList.forEach {
                it.uploadTime = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli()
            }
            if (bloodPressureService.saveBatch(bloodPressureList)) {
                return ResponseEntity.ok(BaseResponse.Success(null))
            }
        } catch (ex: Exception) {
            logger().error("upload error", ex)
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(BaseResponse.Error(ResponseCode.FAILED))
    }

    @GetMapping("/queryByPage")
    suspend fun queryByPage(page: Long): ResponseEntity<BaseResponse> {
        try {
            var bloodPressurePage = Page<BloodPressure>(page, 20)
            bloodPressurePage = bloodPressureService.page(bloodPressurePage)
            return ResponseEntity.ok(BaseResponse.Success(bloodPressurePage.records))
        } catch (ex: Exception) {
            logger().error("query error", ex)
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(BaseResponse.Error(ResponseCode.FAILED))
    }
}