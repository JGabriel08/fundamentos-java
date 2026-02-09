
import java.util.Scanner;

public class MenuSimplesDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean estado = true;
        int opcao;

        do { 
            System.out.println("Menu Super Simples");   
            System.out.println("1 - Dizer Olá");    
            System.out.println("2 - Dizer Tchau");    
            System.out.println("0 - Sair");    
            System.out.print("Digite a opção que deseja: ");
            opcao = input.nextInt();

            if(opcao == 1){
                System.out.println("Olá!!!!!!!!!!!!!");
            }

            else if(opcao == 2){
                System.out.println("Tchau!!!!!!");
            }

            else if( opcao == 0){
                System.out.println("Menu Super Simples encerrado!");
                estado = false;
            }
            else {
                System.out.println("Caractere digitado invalido!");
            }

        } while (estado == true);
    }
}
