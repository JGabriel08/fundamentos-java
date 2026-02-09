

import java.util.Scanner;

public class ContadorSimples {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int num, contador = 1;

       System.out.print("Digite um numero: ");
       num = input.nextInt();

       if(num > 0){

        while(contador <= num){
        System.out.println("Numero " + contador + "º");
        contador++;
        }
       }

       else{
        System.out.print("Numero menor ou igual a 0, impossivel contar!");
        input.close();
        return;
       }
       
       input.close();

   } 
}
