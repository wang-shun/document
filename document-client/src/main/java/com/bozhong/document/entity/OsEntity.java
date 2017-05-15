package com.bozhong.document.entity;

import com.alibaba.fastjson.JSON;
import com.bozhong.document.common.WebSettingParam;
import com.bozhong.myswitch.common.SwitchUtil;

import java.io.Serializable;

/**
 * Created by xiezg@317hu.com on 2017/5/12 0012.
 */
public class OsEntity implements Serializable {

    /**
     *
     */
    private String number;

    /**
     * IP
     */
    private String ip;

    /**
     * 操作系统名称
     */
    private String osName;

    /**
     * 操作系统架构
     */
    private String osArch;

    /**
     * 操作系统版本
     */
    private String osVersion;

    /**
     * jvm总内存
     */
    private String jvmTotalMemory;

    /**
     * jvm剩余内存
     */
    private String jvmFreeMemory;

    /**
     * jvm最大内存
     */
    private String jvmMaxMemory;

    /**
     * 处理器个数
     */
    private String availableProcessors;

    /**
     * 文档转换服务器状态（只读，可执行）
     */
    private String osStatus;

    /**
     * 是否开启系统资源限制，目前只支持同一文档转换短时间内禁止
     */
    private String osResourceProtection;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsArch() {
        return osArch;
    }

    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getJvmTotalMemory() {
        return jvmTotalMemory;
    }

    public void setJvmTotalMemory(String jvmTotalMemory) {
        this.jvmTotalMemory = jvmTotalMemory;
    }

    public String getJvmFreeMemory() {
        return jvmFreeMemory;
    }

    public void setJvmFreeMemory(String jvmFreeMemory) {
        this.jvmFreeMemory = jvmFreeMemory;
    }

    public String getAvailableProcessors() {
        return availableProcessors;
    }

    public void setAvailableProcessors(String availableProcessors) {
        this.availableProcessors = availableProcessors;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getJvmMaxMemory() {
        return jvmMaxMemory;
    }

    public void setJvmMaxMemory(String jvmMaxMemory) {
        this.jvmMaxMemory = jvmMaxMemory;
    }

    public String getOsStatus() {
        return osStatus;
    }

    public void setOsStatus(String osStatus) {
        this.osStatus = osStatus;
    }

    public String getOsResourceProtection() {
        return osResourceProtection;
    }

    public void setOsResourceProtection(String osResourceProtection) {
        this.osResourceProtection = osResourceProtection;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public OsEntity() {
        this.setIp(SwitchUtil.getIp());
        this.setOsName(System.getProperty("os.name"));
        this.setOsArch(System.getProperty("os.arch"));
        this.setOsVersion(System.getProperty("os.version"));
        this.setJvmTotalMemory(((double) Runtime.getRuntime().totalMemory() / 1024 / 1024) + "MB");
        this.setJvmFreeMemory(((double) Runtime.getRuntime().freeMemory() / 1024 / 1024) + "MB");
        this.setJvmMaxMemory(((double) Runtime.getRuntime().maxMemory() / 1024 / 1024) + "MB");
        this.setAvailableProcessors(Runtime.getRuntime().availableProcessors() + "");
        this.setOsStatus(WebSettingParam.OPEN_CONVERSION ? "可执行" : "只读");
        this.setOsResourceProtection(WebSettingParam.CONVERSION_SAME_REQUEST_CONTROLLER ? "开启中" : "关闭中");
    }
}
