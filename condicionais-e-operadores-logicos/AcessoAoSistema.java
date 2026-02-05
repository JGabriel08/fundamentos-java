import java.util.Scanner;

public class AcessoAoSistema {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String user, password;

        System.out.print("Digite o usuário: ");
        user = input.next();

        System.out.print("Digite sua senha: ");
        password = input.next();

        if( user.equals("admin") && password.equals("1234")){
            System.out.print("Acesso Permitido.");
        }

        else if( user.equals("admin") && !password.equals("1234")){
            System.out.print("Senha incorreta");
        }

        else{
            System.out.print("Usuário não encontrado");
        }

        input.close();
    }
}
