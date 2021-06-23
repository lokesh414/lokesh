import static java.lang.Math.*;
public interface BonusCalculator{
  int BONUS = 2000;
  void calcbonus(int x);
  default void greetMessage()
  {
	  System.out.println("have a good day");
	  /*static void Check()
	  {
		  System.out.println("static void");
	  }
}*/