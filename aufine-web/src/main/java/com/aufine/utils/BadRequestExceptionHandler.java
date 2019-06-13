package com.aufine.utils;

import com.aufine.bean.AjaxResponseBody;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 处理异常的类
 */
@RestControllerAdvice
public class BadRequestExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(BadRequestExceptionHandler.class);
    /**
     * 对方法参数校验异常处理方法
     */
    @ExceptionHandler(BindException.class)
    public AjaxResponseBody handlerNotValidException(BindException exception) {
        AjaxResponseBody ajaxResponseBody = new AjaxResponseBody();
        ResponseEntity<Map<String, Object>> responseEntity = null;
        BindingResult result = exception.getBindingResult();
        Map<String, Object> maps;

        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            maps = new HashMap<>(fieldErrors.size());
            fieldErrors.forEach(error -> {
                maps.put(error.getField(), error.getDefaultMessage());
            });
        } else {
            maps = Collections.EMPTY_MAP;
        }
        ajaxResponseBody.setResult(ResponseEntity.status(HttpStatus.BAD_REQUEST).body(maps));
        return ajaxResponseBody;
    }



}
