interface bishal
{
public
    void show();
}
  
interface geeks
{
public
    int show();
}
  
class Testt implements bishal, geeks
{
    void show() // Overloaded method based on return type, Error
    {
    }
    int show() // Error
    {
        return 1;
    }
public
    static void main(String args[])
    {
    }
}