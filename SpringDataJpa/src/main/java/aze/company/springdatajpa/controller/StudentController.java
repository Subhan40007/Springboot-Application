package aze.company.springdatajpa.controller;

import aze.company.springdatajpa.entity.Student;
import aze.company.springdatajpa.service.StudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/all-students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/student/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/new")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PostMapping("/newAll")
    public List<Student> createAllStudent(@RequestBody List<Student> student) {
        return studentService.createAllStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        System.out.println("Deleted Succesfull!");
        studentService.deleteStudent(id);
    }

    @PutMapping("/edit/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return studentService.updateStudent(id,student);
    }


}
