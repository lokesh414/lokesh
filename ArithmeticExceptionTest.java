import java.lang.ArithmeticException;
public class ArithmeticExceptionTest {
   public static void main(String[] args) {
      int a = 0, b = 10;
      int c = b/a;
      System.out.println("Value of c is : "+ c);
   }
}