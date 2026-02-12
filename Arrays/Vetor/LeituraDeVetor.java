
import java.util.Scanner;

public class LeituraDeVetor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        for(int i = 0; i <num.length; i++){
            System.out.print("Digite o valor da posição N" + i + "° ");
            num[i] = input.nextInt();
        }

        for(int i = 0; i <num.length; i++){
            System.out.println(num[i]);
        }

        input.close();
    }
}