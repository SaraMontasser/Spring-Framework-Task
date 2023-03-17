package com.example.spring_framework_task.dao;

import com.example.spring_framework_task.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {



    Teacher getTeachersByEmail(String mail);
    void deleteTeacherById(Long Id);

    Teacher save(Teacher teacher);

    List<Teacher> findTeachersByFirstNameContainingOrLastNameContaining(char letter,char letter2);




}
