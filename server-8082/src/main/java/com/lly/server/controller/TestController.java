package com.lly.server.controller;

import com.lly.server.entity.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: some desc
 * @author: lyluo
 * @date: 2021/05/31
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/t1")
    //方式三： 单个请求的跨域通过 @CrossOrigin 注解来实现
//    @CrossOrigin("http://localhost:8081")
    public Student t1() {
        Student student = new Student();
        student.setName("小明");
        return student;
    }

}
