import java.util.Scanner;

public class VerificadorDeIdadeETrabalho {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int idade;
    String trabalho;
    boolean estado;

    System.out.print("Digite sua idade: ");
    idade = input.nextInt();
    
    System.out.print("Você trabalha (sim ou nao): ");
    trabalho = input.next();

    if(trabalho.equalsIgnoreCase("sim")){
        estado = true;
    }

    else if(trabalho.equalsIgnoreCase("nao")){
        estado = false;
    }

    else{
        System.out.print("Você digitou um caracter incorreto");
        input.close();
        return;
    }
     
    if( idade < 16){
        System.out.print("Proibido trabalhar!");
    }

    else if( idade >= 16 && estado == false){
        System.out.print("Pode trabalhar, mas está desempregrado.");
    }

    else{
        System.out.print("Trabalhador ativo");
     }

    }
}