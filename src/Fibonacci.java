import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scan.nextInt();
        if(cont(num)){
            System.out.println(num + "Pertence a sequencia Fibonacci");
        } else {
            System.out.println(num + "Não pertence a sequencia Fibonacci");
        };
    }
    static boolean cont (int n) {
        if (n < 0) {
            return false;
        }
        int a = 0;
        int b = 1;

        while (a <= n){
            if(a==n){
                return true;
            }

            int c = a + b;
            a = b;
            b = c;
        }


        return false;
    }
}

