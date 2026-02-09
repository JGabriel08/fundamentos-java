import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite o número que você deseja começar a contagem regressiva: ");
        num = input.nextInt();

        if(num <= 0){
            System.out.print("Número invalido!");
            input.close();
            return;
        }

        while( num >= 0){
            System.out.println(num);
            num--;
        }

        input.close();

    }
}
