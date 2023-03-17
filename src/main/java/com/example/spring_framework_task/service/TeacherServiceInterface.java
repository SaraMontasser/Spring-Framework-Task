package com.example.spring_framework_task.service;

import com.example.spring_framework_task.entity.Teacher;

import java.util.List;

public interface TeacherServiceInterface {

    List<Teacher> findTeachersByletterAinFirstName(char letter);
    Teacher findTeacherByMail(String mail);

    void deleteTeacherById(Long Id);

    Teacher SaveTeacher(Teacher teacher);
}
