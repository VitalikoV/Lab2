package com.company.Task3;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> students;

    public Course(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void calculateRating() throws Exception {
        for (Student stud : students){
            System.out.println("Prosperity of the " + stud.getFirstName() + " " + stud.getLastName() +  ": " + stud.calculateProsperityInPercent());
        }
    }
}
