package org.haqnawaz.assignment_database;

public class Student {
    private int ID;
    private String Name;
    private String RollNumber;
    private boolean isEnroll;

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + Name + '\'' +
                ", rollNumber=" + RollNumber +
                ", isEnroll=" + isEnroll +
                '}';
    }
    public Student(int id, String name, String rollNmber, boolean isEnroll) {
        this.ID = id;
        this.Name = name;
        this.RollNumber = RollNumber;
        this.isEnroll = isEnroll;
    }
    public Student( String name, String rollNmber, boolean isEnroll) {
        this.Name = name;
        this.RollNumber = RollNumber;
        this.isEnroll = isEnroll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(String rollNumber) {
        RollNumber = rollNumber;
    }

    public boolean isEnroll() {
        return isEnroll;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }
}
