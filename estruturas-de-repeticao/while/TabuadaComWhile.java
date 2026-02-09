import java.util.Scanner;

public class TabuadaComWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, contador = 1;

        System.out.print("Digite o valor que você deseja saber a tabuada: ");
        num = input.nextInt();

        if (num <= 0) {
            System.out.println("Número inválido");
            input.close();
            return;
        }

        while(contador <= 10){
            System.out.println(num + " x " + contador + " = " + (num * contador )); 
            contador++;
        }

        input.close();

    }
}
