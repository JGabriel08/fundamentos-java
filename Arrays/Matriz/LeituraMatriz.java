
import java.util.Scanner;

public class LeituraMatriz{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int[][] num = new int[3][3];

       for(int i = 0; i < num.length; i++){
        for(int j = 0; j < num.length; j++){
            System.out.print("Digite o numero: ");
            num[i][j] = input.nextInt();
        }
       }

       for(int i = 0; i < num.length; i++){
        for(int j = 0; j < num.length; j++){
            System.out.print(num[i][j]);
        }
        System.out.println();
       }
    }
}