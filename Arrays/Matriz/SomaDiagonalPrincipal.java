
import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[3][3];

        int soma = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print("Digite o numero: ");
                num[i][j] = input.nextInt();

                if(i == j){
                    soma = soma + num[i][j];
                }
            }
        }

        System.out.print("A soma da todos os numeros da diagonal é de " + soma);
        
        input.close();
    }
}
