import java.util.Scanner;

public class SomaAteZero {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int  num = -1, total = 0;

       while( num != 0){

        System.out.print("Digite um valor(digite 0 para cancelar): ");
        num = input.nextInt();

        if( num > 0){
            total += num;

        }
        
       }      
       System.out.println("O valor total da soma dos numeros digitados é de : " + total);
       input.close();

    }
}
