package com.jooq.jOOQ.StudentController;


import com.jooq.jOOQ.StudentRepository.StudentRepository;
import com.jooq.jOOQ.model.tables.pojos.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getDetails(){
        return studentRepository.getDetails();
    }

    @GetMapping("/students/{id}")
    public Student getById(@PathVariable int id, @RequestBody Student student){
        return studentRepository.getById(id);
    }

    @PostMapping("/students")
    public void add(@RequestBody Student student){
        studentRepository.add(student);
    }

    @PutMapping("/students/{id}")
    public void update(@PathVariable int id,@RequestBody Student student){
        studentRepository.update(student,id);
    }

    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable int id){
        studentRepository.delete(id);
    }

}
