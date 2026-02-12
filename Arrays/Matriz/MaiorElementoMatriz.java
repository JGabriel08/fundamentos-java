import java.util.Scanner;

public class MaiorElementoMatriz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] num = new int[3][3];

        int maior = 0;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print("Digite um numero: ");
                num[i][j] = input.nextInt();

                if(i == 0 && j == 0){
                    maior = num[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }

                else if(num[i][j] > maior){
                    maior = num[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("O maior numero é " + maior);
        System.out.println("Ele se encontra na posição [" + linhaMaior + "][" + colunaMaior + "]");

        input.close();
    }
}