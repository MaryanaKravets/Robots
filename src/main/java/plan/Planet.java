package plan;

public enum Planet {
    SEAS,
    WIND,
    SUN;

    public void whereYou(Planet planet) {
        switch (planet) {
            case SEAS:
                System.out.println("We are at the Seas Planet");
                break;
            case WIND:
                System.out.println("We are at the Wind Planet");
                break;
            case SUN:
                System.out.println("We are at the Sun Planet");
                break;
        }
    }
}




