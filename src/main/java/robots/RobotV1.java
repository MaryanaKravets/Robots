package robots;

public class RobotV1 {
    private int id;
    private String name;
    private int year;


    public RobotV1(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    private int getId() {
        return id;
    }

    private String getName() {
        return name;
    }

    private int getYear() {
        return year;
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




