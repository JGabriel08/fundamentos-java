
import java.util.Scanner;

public class AnaliseCompletaMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[4][4];
        int somadigprincipal = 0, somadigsecundaria = 0, maior = 0;
        int qtdpares = 0, somalinhas = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print("Digite o numero: ");
                num[i][j] = input.nextInt();

                if(i == j){
                    somadigprincipal = somadigprincipal + num[i][j];
                }

                if(i + j == num.length - 1){
                    somadigsecundaria = somadigsecundaria + num[i][j];
                }

                if(i == 0 && j == 0){
                    maior = num[i][j];
                }

                else if(num[i][j] > maior){
                    maior = num[i][j];
                }

                if(num[i][j] % 2 == 0){
                    qtdpares++;
                }
            }
        }

        System.out.println("A soma da diagonal principal é de " + somadigprincipal);
        System.out.println("A soma da diagonal secundaria é de " + somadigsecundaria);
        System.out.println("O maior número da matriz é de " + maior);
        System.out.println("A quantidade de números pares é de " + qtdpares);

        for(int i = 0; i < num.length; i++){

            somalinhas = 0;

            for(int j = 0; j < num[i].length; j++){
                somalinhas = somalinhas + num[i][j];

            }

            System.out.println("A soma da linha [" + i + "] é de " + somalinhas);

        }
    }
}
