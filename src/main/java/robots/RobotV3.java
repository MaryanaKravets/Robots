package robots;

public class RobotV3 extends RobotV2 {
    private String firm;

    RobotV3() {

    }

    public RobotV3(int id, String name, int year, String model, String firm) {
        super(id, name, year, model);
        this.firm = firm;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void shootRobot() {
        System.out.println("Robot shoots");
    }


    @Override
    public String toString() {
        return super.toString() + " firm: " + getFirm();
    }
}
