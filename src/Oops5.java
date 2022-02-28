public class Oops5 {
    public static void main(String[] args) {
        // break switch loop
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                if(i==3)
                {
                    break;// unlabeled Break statement
                    // when we apply the break statement in inner loop it will break only inner loop that is called
                    // unlabeled Break statement.
                }
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
