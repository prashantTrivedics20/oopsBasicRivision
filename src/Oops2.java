import java.util.Arrays;

// shallow copy and deep copy (both deep copy and shallow copy refer to creating a copy of the object given in different ways.
// Object copy
public class Oops2 {
    public static void main(String[] args) {

        /*
        1-shallow
        2-Deep
        3-Clone
         */
        // Deep

        abcd obj=new abcd();
        obj.i=5;
        obj.j=6;
        abcd obj1=new abcd();
        obj1.i=obj.i;// this is the deepcopy
        obj1.j=obj.j;
        obj1.j=8;
        // so deep copy is very redundant approach
        // means each and every object you have to write the statement for the copy the value of one  object to another
        System.out.println(obj);
        System.out.println(obj1);
    }
}
class abcd
{
    int i;
    int j;

    @Override
    public String toString() {
        return "abcd{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
