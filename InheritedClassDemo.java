abstract class AbstractDemo { 
   private int i = 0;
   public void display() {
      System.out.print("Welcome to Tutorials Point");
   }
}
public class InheritedClassDemo extends AbstractDemo {
   public static void main(String args[]) {
      AbstractDemo demo = new InheritedClassDemo();
      demo.display();
   }
}