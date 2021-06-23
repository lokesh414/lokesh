class EnumDemo {
    enum Gender {
        M("Male"), F("Female"), N("None");
        Gender(String s) {
        }
    }
    public void enumSwitch() {
        Gender gender = Gender.M;
        switch (gender) {
        case M:
            System.out.println("You are male");
            break;
        case F:
            System.out.println("You are Female");
            break;
        default:
            System.out.println("You are not male, not female");
        }
    }
    public static void main(String[] args) {
        EnumDemo out = new EnumDemo();
        out.enumSwitch();
    }
}