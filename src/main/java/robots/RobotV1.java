package robots;

import plan.Planet;

import java.util.Random;

public class RobotV1 {
    private int id;
    private String name;
    private int year;

    RobotV1() {

    }

    public RobotV1(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void goRobot() {
        System.out.println("Robot goes");
    }


    public void transfRobot(char i) {
        switch (i) {
            case 'A':
                System.out.println("Robot transformation: I can swim");
                break;
            case 'B':
                System.out.println("Robot transformation: I can fly");
                break;
            case 'C':
                System.out.println("Robot transformation: I love the sun");
                break;

        }
    }

    @Override
    public String toString() {
        return getClass() + " id: " + getId() + " name: " + getName() + "  year: " + getYear();
    }
}




