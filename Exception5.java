public class Exception5 {
      
    public static void main(String args[]) {
        try 
        {
            Class.forName("jala technologies");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}