public class VarargsInJava {
    public static void main(String[] args) {
        Display obj=new Display();
        obj.show(5);
    }
}
class Display
{
    public void show(int a)//varargs-variable Argument
            // in which situation we use the varargs if we are not certain about that how many value user pass to the method
            // we use the concept of array
    {
        System.out.println(a+"->pk");
    }
    public void show(int ...a)// varargs..
    {
        for(int i:a)
        {
            System.out.println(i);
        }
    }
//    public void show(int a,int b)
//    {
//        System.out.println(a);
//        System.out.println(b);
//    }
}
