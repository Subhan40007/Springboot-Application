package aze.company.springdatajpa.service;

import aze.company.springdatajpa.entity.Student;
import aze.company.springdatajpa.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Integer id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> createAllStudent(List<Student> student) {
        return studentRepository.saveAll(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Integer id, Student student) {
        Optional<Student> foundedStudent = studentRepository.findById(id);

        if (foundedStudent.isPresent()) {
            Student newStudent = foundedStudent.get();
            newStudent.setName(student.getName());
            newStudent.setSurname(student.getSurname());
            newStudent.setBirthOfDate(student.getBirthOfDate());
            newStudent.setCardNumber(student.getCardNumber());
            return studentRepository.save(newStudent);
        }

        return null;
    }
}
