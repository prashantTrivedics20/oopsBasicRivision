// this is main representation of Annonymous inner class
class A3
{
    int rollno;
    String sname;

}
class B3
{
    public void show()
    {
        System.out.println("hello");
    }
}

public class AnnonymousInnerClass1{
    public static void main(String[] args) {
        B3 obj1=new B3()// Anonymous class
        {   public void show()
            {
                System.out.println("hi");
            }
        };
        obj1.show();
    }
}
