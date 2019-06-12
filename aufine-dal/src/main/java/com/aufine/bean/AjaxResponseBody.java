package com.aufine.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 返回前端JSON格式
 */
@Setter
@Getter
public class AjaxResponseBody implements Serializable {
    private String status;
    private String msg;
    private Object result;
    private String token;
}
