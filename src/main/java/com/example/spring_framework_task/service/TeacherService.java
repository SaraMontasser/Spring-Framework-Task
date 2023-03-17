package com.example.spring_framework_task.service;

import com.example.spring_framework_task.dao.TeacherRepository;
import com.example.spring_framework_task.entity.Teacher;
import com.example.spring_framework_task.TeacherServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements TeacherServiceInterface {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public findTeacherByMail(String mail) {
        return teacherRepository.findTeacherByMail(mail).get();
    }

    @Override
    public findTeachersByletterAinFirstName(char letter) {
        return teacherRepository.findTeachersByletterAinFirstName(letter).get();
    }

    @Override
    public deleteTeacherById(Long Id) {
        return teacherRepository.deleteTeacherById(Id);
    }
    @Override
    public SaveTeacher(Teacher teacher) {
        return teacherRepository.SaveTeacher(teacher);
    }
}
