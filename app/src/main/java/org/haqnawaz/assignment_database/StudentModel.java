package org.haqnawaz.assignment_database;

public class StudentModel {
    private int id;
    private String name;
    private String rollNmber;
    private boolean isEnroll;

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", rollNmber=" + rollNmber +
                ", isEnroll=" + isEnroll +
                '}';
    }

    public StudentModel(int id, String name, String rollNmber, boolean isEnroll) {
        this.id = id;
        this.name = name;
        this.rollNmber = rollNmber;
        this.isEnroll = isEnroll;
    }
    public StudentModel( String name, String rollNmber, boolean isEnroll) {
        this.name = name;
        this.rollNmber = rollNmber;
        this.isEnroll = isEnroll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNmber() {
        return rollNmber;
    }

    public void setRollNmber(String rollNmber) {
        this.rollNmber = rollNmber;
    }

    public boolean isEnroll() {
        return isEnroll;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }
}
