// in object class we have method called clone which is protected field.. which is implemented the cloneable interface
public class Oops3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        abcde obj=new abcde();
        obj.i=5;
        obj.j=6;
        abcde obj1= (abcde)obj.clone();
        obj1.j=8;
        System.out.println(obj1);
        System.out.println(obj);
    }
}
class abcde implements Cloneable// this is a marker interface
{
    int i;
    int j;
    @Override
    public String toString() {
        return "abcde{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();// it throws an Exception called CloneNotSupportException
        // it return Object.
    }
}