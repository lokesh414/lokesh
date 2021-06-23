class PrivateVariable1 {
    // private variable
    private String name;
}

public class PrivateVariable {
    public static void main(String[] main){

        // create an object of Data
        PrivateVariable1 d = new PrivateVariable1();

        // access private variable and field from another class
        d.name = "Programiz";
    }
}