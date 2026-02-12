
import java.util.Scanner;

public class MediaDasNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[4];
        double total = 0, media;

        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite sua nota nº " +( i + 1) + ": ");
            notas[i] = input.nextDouble();

            total = total + notas[i];

        }

        media = total / 4;

        if(media >= 7){
            System.out.print("A sua média total foi de " + media + " Seu estado é de APROVADO");
        }

        else{
            System.out.print("A sua média total foi de " + media + " Seu estado é de REPROVADO");
        }

        input.close();
    }
}
