import java.util.Scanner;

public class ControleDeCompra {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       double valor;
       boolean estado;
       String vip;

       System.out.print("Qual o valor da compra: ");
       valor = input.nextDouble();

       System.out.print("Você e vip na empresa(Sim ou Não): ");
       vip = input.next();

       if(vip.equalsIgnoreCase("sim")){
            estado = true;
       }

       else if(vip.equalsIgnoreCase("nao")){
        estado = false;
       }

       else{
        System.out.print("Caracter invalido!");
        input.close();
        return;
       }

       if( valor <= 0){
        System.out.print("Valor invalido!");
       }

       else if(valor >= 500 || estado == true ){

        System.out.print("Desconto aplicado!");

       }

       else{
        System.out.print("Sem desconto!");
       }
       
       input.close();

    }
}
