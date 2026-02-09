public class ContadorComCondicao {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + "JavaLoop");
            }

            else if(i % 3 == 0){
                System.out.println(i + "Java");
            }

            else if (i % 5 == 0){
                System.out.println(i + "Loop");
            }

            else{
                System.out.println(i);
            }
        }
    }
}
