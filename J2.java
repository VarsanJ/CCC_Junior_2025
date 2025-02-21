import java.util.Scanner;
public class J2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int start = r.nextInt();
        int instances = r.nextInt();
        for (int i = 0; i < instances; i++){
            String action = r.next();
            int change = r.nextInt();
            if (action.equals("-")){
                change*=-1;
            }
            start += change;
        }
        System.out.println(start);
    }
}