package com.pgm.springdemo.controller;


import com.pgm.springdemo.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
@RequestMapping("/todo")
public class TodoController {

    /*localhost:8080/todo/list GET 방식 요청 처리*/
    //@RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping("/list")
    public void list() {
        log.info("list");
    }
    //@RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void registerGet() {
        log.info("registerGet");

    }
    //@RequestMapping(value = "/register", method = RequestMethod.POST)
    @PostMapping("/register")
    public String registerPost(@ModelAttribute TodoDTO todoDTO, Model model) {
        // @ModelAttribute : 전달된 파라미터를 자동으로 객체로 변환해서 view까지 전달
        log.info("registerPost");
        /*model.addAttribute("dto", todoDTO);*/
        return "redirect:/todo/list"; // redirect: 접두어를 사용하면 지정한 경로로 리다이렉트(controller를 찾음), 즉 다시 list로 이동.
    }
}
