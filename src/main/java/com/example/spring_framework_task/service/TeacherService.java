package com.example.spring_framework_task.service;

import com.example.spring_framework_task.dao.TeacherRepository;
import com.example.spring_framework_task.entity.Teacher;
import com.example.spring_framework_task.service.TeacherServiceInterface;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements TeacherServiceInterface {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher findTeacherByMail(String mail) {
        return teacherRepository.getTeachersByEmail(mail);
    }

    @Override
    public List<Teacher> findTeachersByletterAinFirstName(char letter) {
        return teacherRepository.findTeachersByFirstNameContainingOrLastNameContaining(letter,letter);
    }

    @Override
    @Transactional
    public void deleteTeacherById(Long Id) {
        teacherRepository.deleteTeacherById(Id);
    }
    @Override
    public Teacher SaveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
