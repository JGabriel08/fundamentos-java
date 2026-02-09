
import java.util.Scanner;

public class ContarAteNDoWhile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, cont = 1;

        System.out.print("Digite um número positivo: ");
        num1 = input.nextInt();

        if(num1 <= 0){
            System.out.print("Erro, número invalido!!");
            input.close();
            return;
        }

        do { 
            System.out.println(cont);
            cont++;
        } while (cont <= num1);

        input.close();
    }
}