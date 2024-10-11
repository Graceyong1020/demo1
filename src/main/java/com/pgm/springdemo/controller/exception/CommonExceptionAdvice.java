package com.pgm.springdemo.controller.exception;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class CommonExceptionAdvice {

    @ResponseBody // JSON 형태로 결과를 반환
    @ExceptionHandler(NumberFormatException.class)
    public String exceptNumber(NumberFormatException e){
        log.error("--------------------");
        log.error(e.getMessage());

        return "NUMBER FORMAT EXCEPTION";
    }

}
