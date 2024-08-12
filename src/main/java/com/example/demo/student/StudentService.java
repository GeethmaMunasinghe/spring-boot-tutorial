package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Geethma",
                        "Munasinghe",
                        LocalDate.now(),
                        "geethma1234abc@gmail.com",
                        23
                ),
                new Student(
                        "Student 3",
                        "Imesha",
                        LocalDate.now(),
                        "sach3456ime@gmail.com",
                        26
                )
        );
    }
}
