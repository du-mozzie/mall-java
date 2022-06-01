package com.du.common.exception;

public enum BizExceptionEnum {

    /**
     * 未知异常
     */
    UNKNOWN_EXCEPTION(10001, "未知系统异常"),

    /**
     * 参数校验异常
     */
    ILLEGAL_FIELD_EXCEPTION(10002, "参数格式异常"),

    /**
     * 更新或删除的实体不存在
     */
    DOMAIN_NOT_EXISTS(10003, "更新或删除实体不存在"),


    /**
     * product 模块 11 开头
     */

    /**
     * 品牌与分类关联异常
     */
    PRODUCT_BRAND_CATEGORY_RELATION_CHECK_FAIL(11001, "品牌与分类的管理必须唯一");

    /**
     * 错误码
     */
    private final Integer code;
    /**
     * 错误信息
     */
    private final String msg;

    BizExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
