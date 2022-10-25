package com.flavio.crudspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flavio.crudspring.model.Course;
import com.flavio.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController //afirma q a classe vai ter um end-point
@RequestMapping("/api/courses")
@AllArgsConstructor

    public class CourseController {

        private final CourseRepository courseRepository;
        
        @GetMapping
        public List<Course> list(){
            return courseRepository.findAll(); // SELECT * DA TABELA
        }
}
