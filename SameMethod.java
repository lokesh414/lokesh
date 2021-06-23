class SameMethod{
   void disp(int a, double b){
	System.out.println("Method A");
   }
   void disp(int a, double b, double c){
	System.out.println("Method B");
   }
   public static void main(String args[]){
	SameMethod obj = new SameMethod();
		obj.disp(100, 20.67f);
   }
}