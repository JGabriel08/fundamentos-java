import java.util.Scanner;

public class DecisaoDeCarreira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean estadologica, estadomatematica, estadopessoas;
        String logica, matematica, pessoas;

        System.out.print("Você gosta de logica(sim ou nao): ");
        logica = input.next();

        if( logica.equalsIgnoreCase("sim")){
            estadologica = true;
        }

        else if( logica.equalsIgnoreCase("nao")){
            estadologica = false;
        }

        else{
            System.out.print("Caractere invalido!");
            input.close();
            return;
        }

        System.out.print("Você gosta de matematica(sim ou nao): ");
        matematica = input.next();

        if( matematica.equalsIgnoreCase("sim")){
            estadomatematica = true;
        }

        else if( matematica.equalsIgnoreCase("nao")){
            estadomatematica = false;
        }

        else{
            System.out.print("Caractere invalido!");
            input.close();
            return;
        }

        System.out.print("Você gosta de pessoas(sim ou nao): ");
        pessoas = input.next();

        if( pessoas.equalsIgnoreCase("sim")){
            estadopessoas = true;
        }

        else if( pessoas.equalsIgnoreCase("nao")){
            estadopessoas = false;
        }

        else{
            System.out.print("Caractere invalido!");
            input.close();
            return;
        }



        if(estadologica == true && estadomatematica == true){
            System.out.print("Possivel Dev BackEnd!");
        }

        else if(estadopessoas == true && estadologica == false){
            System.out.print("Área de humanas");
        }

        else if(estadomatematica == false && estadologica == false){
            System.out.print("Repensar área de tecnologia");
        }

        else{
             System.out.print("Área hibrida");
        }

    }
}
