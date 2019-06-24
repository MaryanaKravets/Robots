package robots;

public class RobotV2 extends RobotV1 {
    private String model;


    public RobotV2(int id, String name, int year, String model) {
        super(id, name, year);
        this.model = model;

    }

    private String getModel() {
        return model;
    }

    public void exclamRobot() {
        System.out.println("Robot says Hello!");
    }


    @Override
    public String toString() {
        return super.toString() + " model: " + getModel();
    }
}
