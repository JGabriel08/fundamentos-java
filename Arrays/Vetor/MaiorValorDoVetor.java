
import java.util.Scanner;

public class MaiorValorDoVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[6];

        System.out.print("Digite o numero da posição N " + 0 + "°: ");
        num[0] = input.nextInt();
        int maiorvalor = num[0];

        for(int i = 1; i < num.length; i++){
            System.out.print("Digite o numero da posição N " + i + "°: ");
            num[i] = input.nextInt();

            if(num[i] > maiorvalor){
                maiorvalor = num[i];
            }
        }

        System.out.print("O maior valor digitado é: " + maiorvalor);

        input.close();
    }
}
