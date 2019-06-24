package robots;

public class RobotV2 extends RobotV1 {
    private String model;

    RobotV2() {

    }

    public RobotV2(int id, String name, int year, String model) {
        super(id, name, year);
        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void exclamRobot() {
        System.out.println("Robot says Hello!");
    }


    @Override
    public String toString() {
        return super.toString() + " model: " + getModel();
    }
}
