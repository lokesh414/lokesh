public class LocalVariable{ 
/*int num = 0;      // this is global variable
		num = num + 7;*/
	public void add(){
		int num = 0;
		num = num + 7;
		System.out.println("The number is : " + num);
	}
	public static void main(String args[]){
		LocalVariable obj = new LocalVariable();//this is local variable
		obj.add();
	}
}
 