
import java.util.Scanner;

public class AnaliseDeNotas {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int qtdalunos, acimamedia = 0;
        double somanotas = 0, maiornota = 0, menornota = 9999999;

        System.out.print("Digite a quantidade de alunos: ");
        qtdalunos = input.nextInt();

        double[] alunos = new double[qtdalunos];

        for(int i = 0; i < alunos.length; i++){
            System.out.print("Digite as nota do aluno N" + (i+1) + " °:");
            alunos[i] = input.nextDouble();

            somanotas = somanotas + alunos[i];

            if(maiornota < alunos[i]){
                maiornota = alunos[i];
            }

            if(menornota > alunos[i]){
                menornota = alunos[i];
            }

            if(alunos[i] > 7.0){
                acimamedia++;
            }


        }

        double media = somanotas / qtdalunos;

    
        System.out.println("A média total da turma é de " + media);
        System.out.println("A maior nota da turma é de " + maiornota);
        System.out.println("A menor nota da turma é de " + menornota);
        System.out.println("A quantidade de alunos acima da media 7.0 foi de " + acimamedia);

        input.close();
    }
}
