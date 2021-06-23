import Java.lang.reflect.Method;
class Check {
    private void private_Method()
    {
        System.out.println("Private Method "
                           + "called from outside");
    }
    public void printData()
    {
        System.out.println("Public Method");
    }
}
class Private {
  
    public static void main(String[] args)
        throws Exception
    {
        Check c = new Check();
        Method m = Check.class
                       .getDeclaredMethod("private_Method");
        m.setAccessible(true);
        m.invoke(c);
    }
}