package inherit;

class A
{
    int i = 10;
    void abc()
    {
    	 System.out.println(" inside A  " );
    	
    }
}
 
class B extends A
{
    int i = 20;
    
    void abc()
    {
    	 System.out.println(" inside B  " );
    	
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new B();
 a.abc();
        System.out.println(a.i);
    }
}