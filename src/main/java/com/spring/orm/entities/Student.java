package com.spring.orm.entities;


import javax.persistence.*;

@Entity
@Table(name="student_details")
public class Student {
    @Id
    @Column(name="student_id")
    private int studentId;
    @Column(name="student_name")
    private String studentName;
    @Column(name="student_city")
    private String studentCity;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }


}
