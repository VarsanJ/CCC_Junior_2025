import java.util.Scanner;
public class J3 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int instances = r.nextInt();
        String[] outputs = new String[instances];
        for (int i = 0; i < instances; i++){
            String input = r.next();
            String output = "";
            boolean neg = false;
            int sum = 0;
            int R = 0;
            for (int j = 0; j < input.length(); j++){
                char x = input.charAt(j);
                if (x == '-'){
                    neg = true;
                }
                else if (Character.isDigit(x)){
                    String num = "";
                    for (int y = j; y < input.length(); y++){
                        if (Character.isDigit(input.charAt(y))){
                            num += input.charAt(y);
                        }
                        else {
                            break;
                        }
                        R = y;
                    }
                    j += num.length() - 1;
                    int Num = Integer.parseInt(num);
                    if (neg){
                        Num *= -1;
                        neg = false;
                    }
                    sum += Num;

                }
                else if ((Character.toString(x)).equals((Character.toString(x)).toUpperCase())){
                    output += x;
                }
            }

            output += String.valueOf(sum);
            outputs[i] = output;
        }
        for (int i = 0; i < outputs.length; i++) System.out.println(outputs[i]);
    }
}