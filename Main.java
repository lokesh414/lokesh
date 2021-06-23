//how to create class and object
public class Main // create class
{
  int x = 5;
int y = 10;
  public static void main(String[] args) {
    Main myObj1 = new Main();
	Main myObj2 = new Main();//this is object
    System.out.println(myObj1.x);
	System.out.println(myObj2.y);
  }
}