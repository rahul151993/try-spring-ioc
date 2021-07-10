package org.ioc.example.annotation.auto.wire;

public class ClassRoom {
    private String classRoomNO;

    public ClassRoom(String classRoomNO) {
        this.classRoomNO = classRoomNO;
    }

    public ClassRoom() {
    }

    public String getClassRoomNO() {
        return classRoomNO;
    }

    public void setClassRoomNO(String classRoomNO) {
        this.classRoomNO = classRoomNO;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classRoomNO='" + classRoomNO + '\'' +
                '}';
    }

    public void startTeaching(){
        System.out.println("All students are collected in class room: " + this.classRoomNO);
        System.out.println("Teaching started!");
    }

    public void endTeaching(){
        System.out.println("School Bell ringed");
        System.out.println("Teaching stopped!");
    }
}
