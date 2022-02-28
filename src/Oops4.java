import java.util.Arrays;
public class Oops4 {
    private int []arr;
    public Oops4(int arr1[])
    {
        arr=new int[arr1.length];
        for (int i = 0; i <arr.length ; i++) {
           arr[i]=arr1[i];
        }
    }
    public void display()
    {
        System.out.println(Arrays.toString(arr));
    }
}
class test
{
    public static void main(String[] args) {
        int []data={20,59,39};
        Oops4 obj=new Oops4(data);
        obj.display();
        data[0]=65;
        obj.display();
    }
}
