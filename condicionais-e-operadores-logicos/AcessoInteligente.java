import java.util.Scanner;

public class AcessoInteligente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        boolean estadoestudante, estadofuncionario;
        String funcionario, estudante;

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        if(idade <= 0){
            System.out.print("Idade invalida!");
            input.close();
            return;
        }
        

        System.out.print("Você é estudante(sim ou nao): ");
        estudante = input.next();

        if(estudante.equalsIgnoreCase("sim")){
            estadoestudante = true;
        }

        else if(estudante.equalsIgnoreCase("nao")){
            estadoestudante = false;
        }

        else{
            System.out.print("Você digitou um caracter incorreto");
            input.close();
            return;
        }

        System.out.print("Você é um funcionario(sim ou nao): ");
        funcionario = input.next();

        if(funcionario.equalsIgnoreCase("sim")){
            estadofuncionario = true;
        }

        else if(funcionario.equalsIgnoreCase("nao")){
            estadofuncionario = false;
        }

        else{
            System.out.print("Você digitou um caracter incorreto");
            input.close();
            return;
        }

        if(idade < 18 && !estadoestudante){
            System.out.print("Acesso negado!");
        }

        else if(estadofuncionario){
            System.out.print("Acesso Total!");
        }

        else if(idade >= 18 || estadoestudante){
            System.out.print("Acesso Parcial!");
        }

        else{
            System.out.print("Acesso Negado!");
        }
        
        input.close();

    }
}
