package com.example.spring_framework_task.dao;

import com.siemens.spring_framework_task.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    Teacher[] findTeachersByletterAinFirstName();
    Teacher findTeacherByMail(String mail);

    void deleteTeacherById(Long Id);

    void SaveTeacher(Teacher teacher);

}
}