import java.util.Scanner;

public class ClassificacaoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota;
        int frequencia;

        System.out.print("Digite sua nota: ");
        nota = input.nextDouble();

        System.out.print("Digite sua frequencia em porcentagem: ");
        frequencia = input.nextInt();

        if( frequencia < 75){
            System.out.print("Reprovado por falta!");
        }

        else if( nota >= 7 && frequencia >= 75){
            System.out.print("Aprovado!");
        }

        else if( (nota >= 5 && nota < 7) && frequencia >= 75 ){
            System.out.print("Recuperação!");
        }

        else{
            System.out.print("Reprovado por nota!");
        }

        input.close();

    }
}
