package com.handsOn.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @RequestMapping("/courses")
    public List<Courses> getAllCourses(){
        return Arrays.asList(
                new Courses(1,"java","computer science"),
                new Courses(2,"AI","intelligence"),
                new Courses(3,"Networks","networking")
        );
    }
}
