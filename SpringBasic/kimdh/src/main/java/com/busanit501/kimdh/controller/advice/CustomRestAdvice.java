package com.busanit501.kimdh.controller.advice;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Log4j2
public class CustomRestAdvice {
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public ResponseEntity<Map<String,String>>handleException(BindException ex){
        log.error(ex);

        Map<String,String> errormap = new HashMap<>();
        if(ex.hasErrors()) {
            BindingResult bindingResult = ex.getBindingResult();
            bindingResult.getFieldErrors()
                    .forEach(fieldError -> {
                        errormap.put(fieldError.getField(), fieldError.getDefaultMessage());
                    });
        }
        return ResponseEntity.badRequest().body(errormap);
    }
}
