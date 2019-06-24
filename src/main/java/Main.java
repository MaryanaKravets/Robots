import plan.Planet;
import robots.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(12) + 1;
        System.out.println("Random number: " + i);
        String string = "ABC";
        Random random1 = new Random();
        char symbol = string.charAt(random1.nextInt(string.length()));
        System.out.println("Random symbol: " + symbol);

        if (i >= 1 && i <= 3) {
            RobotV1 r1 = new RobotV1(234345, "Nexus", 1983);
            System.out.println(r1.toString());
            r1.goRobot();
            r1.transfRobot(symbol);
        } else if (i >= 4 && i <= 8) {
            RobotV2 r2 = new RobotV2(456378, "Carol", 1985, "RGB-1");
            System.out.println(r2.toString());
            r2.goRobot();
            r2.exclamRobot();
            r2.transfRobot(symbol);
        } else {
            RobotV3 r3 = new RobotV3(567644, "Poli", 1988, "FTG-2A", "Sony");
            System.out.println(r3.toString());
            r3.goRobot();
            r3.exclamRobot();
            r3.shootRobot();
            r3.transfRobot(symbol);

        }
        switch (symbol) {
            case 'A':
                Planet pl = Planet.SEAS;
                pl.whereYou(pl);
                break;
            case 'B':
                Planet pl1 = Planet.WIND;
                pl1.whereYou(pl1);
                break;
            case 'C':
                Planet pl2 = Planet.SUN;
                pl2.whereYou(pl2);
                break;

        }
    }
}
