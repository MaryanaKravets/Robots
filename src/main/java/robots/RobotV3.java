package robots;

public class RobotV3 extends RobotV2 {
    private String firm;

    public RobotV3(int id, String name, int year, String model, String firm) {
        super(id, name, year, model);
        this.firm = firm;
    }

    private String getFirm() {
        return firm;
    }

    public void shootRobot() {
        System.out.println("Robot shoots");
    }


    @Override
    public String toString() {
        return super.toString() + " firm: " + getFirm();
    }
}
