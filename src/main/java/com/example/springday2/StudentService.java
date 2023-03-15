package com.example.springday2;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<StudentEntity> students = new ArrayList<>(Arrays.asList(
            new StudentEntity(1L, "John"),
            new StudentEntity(2L, "Barry"),
            new StudentEntity(3L, "Paul"))
    );

    public List<StudentEntity> getAllStudents() {
        return students;
    }

    public StudentEntity getStudentInfo(Long id) {
        return students.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }


    public void addStudent(StudentEntity myStudentList) {
       students.add(myStudentList);
    }
}
