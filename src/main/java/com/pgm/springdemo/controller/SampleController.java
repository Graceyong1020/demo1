package com.pgm.springdemo.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public String hello() {
        log.info("hello");
        return "hello"; // /WEB-INF/views/hello.jsp 로 이동
    }
    @GetMapping("/ex1")
    public void ex1(@RequestParam("name") String name,
                    @RequestParam("age") int age,
                    @RequestParam("gender") String gender, Model model) {
        log.info("exl...");
        log.info("name:" + name);
        log.info("age:" + age);
        log.info("gender:" + gender);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("gender", gender);

    }
    @GetMapping("/ex2/{name}")
    public void ex2(@PathVariable("name") String name) {
        log.info("ex2...");
        log.info(name);
    }
    @GetMapping("/ex3")
    public void ex3(@RequestParam("dueDate")LocalDate dueDate, Model model) {
        log.info("ex3...");
        log.info(dueDate);
        model.addAttribute("dueDate", dueDate);
    }
    @GetMapping("/ex4")
    public String ex4(RedirectAttributes redirectAttributes) {
        log.info("ex4...");
        redirectAttributes.addFlashAttribute("result", "success");
        redirectAttributes.addAttribute("name", "Hervey");
        return "redirect:/ex5";
    }
    @GetMapping("/ex5")
    public void ex5(@RequestParam("name") String name, Model model) {
        log.info("ex5...");
        log.info(name);
        model.addAttribute("name", name);
    }

}
