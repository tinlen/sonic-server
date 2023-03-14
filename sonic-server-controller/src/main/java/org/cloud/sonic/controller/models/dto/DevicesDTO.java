package org.cloud.sonic.controller.models.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.cloud.sonic.controller.models.base.TypeConverter;
import org.cloud.sonic.controller.models.domain.Devices;

import java.io.Serializable;
import java.util.Set;

@ApiModel("设备DTO 模型")
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DevicesDTO implements Serializable, TypeConverter<DevicesDTO, Devices> {

    @ApiModelProperty(value = "id", example = "1")
    Integer id;

    @ApiModelProperty(value = "设备名称", example = "My HUAWEI")
    String name;

    @ApiModelProperty(value = "设备备注", example = "My HUAWEI")
    String nickName;

    @ApiModelProperty(value = "型号", example = "HUAWEI MATE 40")
    String model;

    @ApiModelProperty(value = "序列号", example = "random")
    String udId;

    @ApiModelProperty(value = "设备状态", example = "ONLINE")
    String status;

    @ApiModelProperty(value = "所属Agent", example = "1")
    Integer agentId;

    @ApiModelProperty(value = "设备系统", example = "1")
    Integer platform;

    @ApiModelProperty(value = "鸿蒙类型", example = "0")
    Integer isHm;

    @ApiModelProperty(value = "分辨率", example = "1080x1920")
    String size;

    @ApiModelProperty(value = "系统版本", example = "12")
    String version;

    @ApiModelProperty(value = "cpu", example = "arm64")
    String cpu;

    @ApiModelProperty(value = "制造商", example = "HUAWEI")
    String manufacturer;

    @ApiModelProperty(value = "安装密码", example = "123456")
    String password;

    @ApiModelProperty(value = "设备图片路径")
    String imgUrl;

    @JsonIgnore
    @JSONField(serialize = false)
    Set<TestSuitesDTO> testSuites;

    @ApiModelProperty(value = "设备占用者")
    String user;

    @Getter(AccessLevel.NONE)
    @ApiModelProperty(value = "设备温度", example = "33")
    Integer temperature;

    @Getter(AccessLevel.NONE)
    @ApiModelProperty(value = "设备电池电压", example = "33")
    Integer voltage;

    @Getter(AccessLevel.NONE)
    @ApiModelProperty(value = "设备电量", example = "33")
    Integer level;

    @Getter(AccessLevel.NONE)
    @ApiModelProperty(value = "HUB位置", example = "1")
    Integer position;

    @ApiModelProperty(value = "中文设备", example = "荣耀全网通")
    String chiName;

    public int getPosition() {
        if (position == null) {
            return 0;
        }
        return position;
    }

    public int getVoltage() {
        if (voltage == null) {
            return 0;
        }
        return voltage;
    }

    public int getTemperature() {
        if (temperature == null) {
            return 0;
        }
        return temperature;
    }

    public int getLevel() {
        if (level == null) {
            return 0;
        }
        return level;
    }
}
