package com.example.spring_framework_task.service;

import com.example.spring_framework_task.entity.Teacher;

public interface TeacherService {

    Teacher[] findTeachersByletterAinFirstName(char letter);
    Teacher findTeacherByMail(String mail);

    void deleteTeacherById(Long Id);

    void SaveTeacher(Teacher teacher);
}
