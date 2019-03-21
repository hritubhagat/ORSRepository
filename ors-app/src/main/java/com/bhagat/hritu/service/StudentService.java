package com.bhagat.hritu.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bhagat.hritu.dto.StudentDTO;

@Service
public class StudentService {

    private List<StudentDTO> studentList= new ArrayList<>();

    public List<StudentDTO> getStudentList() {
        return studentList;
    }
    
    public void addStudent(StudentDTO std){
        studentList.add(std);
    }
    
    public StudentDTO getByRollNo(String rollNo) {
        Iterator<StudentDTO> itr = studentList.iterator();
        StudentDTO std;
        while (itr.hasNext()) {
            std = itr.next();
            if (std.getRollNo().equals(rollNo)) {
                return std;
            }
        }
        return null;
    }
}
