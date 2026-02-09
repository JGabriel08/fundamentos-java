
import java.util.Scanner;

public class ControleDeTentativasDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tentativas = 0, num;

        do { 
            System.out.print("Digite um numero aleatorio: ");
            num = input.nextInt();

            tentativas++;

            if( num >= 10 && num <= 20){
                System.out.println("Número Válido!!");
                System.out.println("Tentativas: " + tentativas);
                break;
            }

            else if( num < 0){
                System.out.println("Número negativo não permitido");
            }

            else if( num > 100){
                System.out.println("Número muito alto");
            }



        } while (true);

        input.close();
    }
}
