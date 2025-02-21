import java.util.Scanner;
public class J5 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int R = r.nextInt();
        int C = r.nextInt();
        int M = r.nextInt();
        int[] R1 = new int[C];
        int[] R2 = new int[C];
        int[] Ma = new int[M];
        for (int i = 1; i <= M; i++) Ma[i-1] = i;
        int Mac = 0;
        int c = 0;
        for (int i = 0; i < R1.length; i++)
        {
            R1[i] = Ma[c];
            c++;
            if (c > (Ma.length - 1)) c = 0;
        }
        for (int i = 0; i < R2.length; i++)
        {
            R2[i] = Ma[c];
            c++;
            if (c > (Ma.length - 1)) c = 0;
        }
        int MinCost = R1[0] + R2[0];
        if ((R1[0] + R2[1]) < MinCost)  MinCost = R1[0] + R2[1];
        if ((R1[R1.length-1] + R2[R2.length-1]) < MinCost) MinCost = R1[R1.length-1] + R2[R2.length-1];
        if ((R1[R1.length-1] + R2[R2.length-2]) < MinCost) MinCost = R1[R1.length-1] + R2[R2.length-2];
        for (int i = 1; (i < R1.length - 2); i++){
            if ((R1[i] + R2[i-1]) < MinCost) MinCost = (R1[i] + R2[i-1]);
            if ((R1[i] + R2[i]) < MinCost) MinCost = (R1[i] + R2[i]);
            if ((R1[i] + R2[i+1]) < MinCost) MinCost = (R1[i] + R2[i-1]);
        }
        System.out.println(MinCost);
    }
}