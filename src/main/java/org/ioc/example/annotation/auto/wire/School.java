package org.ioc.example.annotation.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class School {

    private String schoolName;

    @Autowired
    @Qualifier("cl3")
    private ClassRoom classRoom;

    public School() {
    }

    public School(ClassRoom classRoom) {
        this.classRoom = classRoom;
        System.out.println("Constructor Injection for classroom");
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
        System.out.println("Setter Injection for classRoom");
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", classRoom=" + classRoom +
                '}';
    }

    @PostConstruct
    public void openSchool(){
        System.out.println("School opened!");
        this.classRoom.startTeaching();
    }

    @PreDestroy
    public void closeSchool(){
        this.classRoom.endTeaching();
        System.out.println("School closed!");
    }
}
