package com.example.spring_framework_task.controller;

import com.example.spring_framework_task.entity.Teacher;
import com.example.spring_framework_task.service.TeacherServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;


import java.util.List;

@RestController

public class TeacherController {

    @Autowired
    private TeacherServiceInterface teacherServiceInterface;

    @GetMapping("/findByMail")
    ResponseEntity<Teacher> findTeacherByMail(@RequestParam String mail) {
        return ResponseEntity.ok(teacherServiceInterface.findTeacherByMail(mail));
    }
    @PostMapping("/save")
    ResponseEntity<Teacher> SaveTeacher(@RequestBody Teacher teacher) {

        return ResponseEntity.ok(teacherServiceInterface.SaveTeacher(teacher));
    }
    @GetMapping("/findByLetter")
    ResponseEntity<List<Teacher>> findTeachersByletterAinFirstName() {
        return ResponseEntity.ok(teacherServiceInterface.findTeachersByletterAinFirstName('a'));
    }

    @DeleteMapping("/deleteById")
    ResponseEntity<String> deleteTeacherById(@RequestParam Long id) {
        teacherServiceInterface.deleteTeacherById(id);
        return ResponseEntity.ok("done");
    }

}
