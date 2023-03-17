package com.example.spring_framework_task.controller;

import com.example.spring_framework_task.entity.Teacher;
import com.example.spring_framework_task.service.TeacherServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherServiceInterface teacherServiceInterface;

    @GetMapping("/findByMail")
    ResponseEntity<Teacher> findTeacherByMail(@RequestParam String mail) {
        return ResponseEntity.ok(teacherServiceInterface.findTeacherByMail(mail));
    }
    @GetMapping("/save")
    ResponseEntity<Teacher> SaveTeacher(@RequestParam Teacher teacher) {
        return ResponseEntity.ok(teacherServiceInterface.SaveTeacher(teacher));
    }
    @GetMapping("/findByLetter")
    ResponseEntity<Teacher> findTeachersByletterAinFirstName(@RequestParam char letter) {
        return ResponseEntity.ok(teacherServiceInterface.findTeachersByletterAinFirstName(letter));
    }
    @GetMapping("/deleteById")
    ResponseEntity<Teacher> deleteTeacherById(@RequestParam Long id) {
        return ResponseEntity.ok(teacherServiceInterface.deleteTeacherById(id));
    }

}
