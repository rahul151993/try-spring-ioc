package org.ioc.example.stand.alone.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private String name;
    private int age;
    private List<String> friends;
    private Set<String> hobbies;
    private Map<Integer, String>  degreeWithPassingYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getDegreeWithPassingYear() {
        return degreeWithPassingYear;
    }

    public void setDegreeWithPassingYear(Map<Integer, String> degreeWithPassingYear) {
        this.degreeWithPassingYear = degreeWithPassingYear;
    }
}
