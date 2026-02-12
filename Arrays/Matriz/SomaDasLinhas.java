import java.util.Scanner;

public class SomaDasLinhas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Leitura da matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Soma de cada linha
        for(int i = 0; i < matriz.length; i++){

            int somaLinha = 0; // reinicia a soma para cada linha

            for(int j = 0; j < matriz[i].length; j++){
                somaLinha += matriz[i][j];
            }

            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        input.close();
    }
}