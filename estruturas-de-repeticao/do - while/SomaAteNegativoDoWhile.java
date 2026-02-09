
import java.util.Scanner;

public class SomaAteNegativoDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, total = 0;

        do { 
            System.out.print("Digite um numero:");
            i = input.nextInt();

            if(i > 0){
                total+= i;
            }
        } while (i >= 0);

        System.out.print("A soma de tudo é " + total);

        input.close();
    }

}