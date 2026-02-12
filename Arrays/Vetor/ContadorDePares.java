
import java.util.Scanner;

public class ContadorDePares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[8];
        int cont = 0;

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = input.nextInt();

            if(num[i] % 2 == 0){
                cont++;
            }

        }

        System.out.print("A quantidade de numeros pares foi de: " + cont);

        input.close();
    }
}
