import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String senha = "" ;

        while(!senha.equals("java123")){
            System.out.print("Digite a senha correta: ");
            senha = input.next();
        }

        System.out.print("Acesso Liberado!");

        input.close();

    }
}
