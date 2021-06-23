public interface InterfaceX
{
    public int geek();
}
public interface InterfaceY
{
    public String geek();
}
public class Testing implements InterfaceX, InterfaceY
{
public String geek()
    {
        return "hello";
    }
}