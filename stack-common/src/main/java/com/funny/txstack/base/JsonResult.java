package com.funny.txstack.base;

import java.io.Serializable;

/**
 * @param <T>
 * @author zhangxuexiang
 * @desc 服务返回处理结果
 * @time 16/3/31 下午4:32
 */
public class JsonResult<T> implements Serializable {

    public static final int CODE_SUCCESS = 0;

    public static final int CODE_FAILURE = -1;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 返回编码
     */
    private Integer returncode;

    /**
     * 返回编码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 业务对象
     */
    private T result;

    /**
     * 业务对象
     */
    private T data;

    public Integer getReturncode() {
        return returncode;
    }

    public void setReturncode(Integer returncode) {
        this.returncode = returncode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return returncode != null && returncode.equals(CODE_SUCCESS) ? true : false;
    }

    public void setSuccess() {
        this.returncode = CODE_SUCCESS;
    }

    public void successMsg(String msg) {
        this.returncode = CODE_SUCCESS;
        this.message = msg;
    }

    public void failMsg(String message) {
        this.returncode = CODE_FAILURE;
        this.message = message;
    }

    public void successBody(T result) {
        this.returncode = CODE_SUCCESS;
        this.message = "成功";
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
