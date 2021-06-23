public abstract class Test {

    void t1()
    {
        System.out.println("super");

    }

}
 public class concret extends Test{

    void t1()
    {
        System.out.println("child");

    }
    void t2()
    {
        System.out.println("child2");

    }

}

public class Run {
    public static void main(String[] args) {
        Test t=new concret();

        t.t1();
    }

}