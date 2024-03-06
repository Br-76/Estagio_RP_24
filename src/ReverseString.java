import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();

        String invert = invertstring(palavra);

        System.out.println("Palavra invertida: " + invert);
    }

    static String invertstring(String input){
        char[] arrai = input.toCharArray();
        int a = 0;
        int b = input.length() - 1;

        while (a < b){
            char c = arrai[a];
            arrai[a] = arrai[b];
            arrai[b] = c;

            a++;
            b--;
        }
        return new String(arrai);
    }
}
