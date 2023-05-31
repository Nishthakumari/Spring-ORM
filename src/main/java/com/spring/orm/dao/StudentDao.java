package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import jakarta.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //save student
    @Transactional
    public int insert(Student student)
    {
        Integer i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }
}
