
import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[4][3];
        int soma = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print("Digite o numero: ");
                num[i][j] = input.nextInt();

                soma = soma + num[i][j];
            }
        }

        System.out.print("A soma de todos os numeros é de " + soma);
        input.close();
    }
}
