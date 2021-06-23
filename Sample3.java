class Overloading
{
   public void disp(char c, int num)
   {
       System.out.println("I’m the first definition of method disp");
   }
   public void disp(int num, char c)
   {
       System.out.println("I’m the second definition of method disp" );
   }
}
class Sample3
{
   public static void main(String args[])
   {
       Overloading obj = new Overloading();
       obj.disp('x', 51 );
       obj.disp(52, 'y');
   }
}