import java.util.Scanner;
public class J4 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int instances = r.nextInt();
        int[] inputs = new int[instances];
        boolean Zero = false;
        for (int i = 0; i < inputs.length; i++){
            String input = r.next();
            if (input.equals("S")) inputs[i] = 1;
            else {
                inputs[i] = 0;
                Zero = true;
            }
        }
        int maxL = 0;
        int currentL = 0;
        for (int i = 0; i < inputs.length; i++){
            boolean current = true;
            int j = i;
            boolean oneChange = false;
            while (current){
                if (inputs[j]==1){
                    currentL += 1;
                    j += 1;
                }
                else if (!oneChange){
                    currentL += 1;
                    j += 1;
                    oneChange = true;
                }
                else{
                    current = false;
                }
                if (j > inputs.length - 1) current = false;
            }
            if (currentL >= maxL) maxL = currentL;
            currentL = 0;
        }
        if (!Zero) maxL--;
        System.out.println(maxL);
    }
}