import java.util.Scanner;
public class J1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int place = r.nextInt();
        int cars = r.nextInt();
        int people = r.nextInt();
        if (place > (cars*people)) System.out.println("no");
        else System.out.println("yes");
    }
}