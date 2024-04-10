import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        while (true){
            System.out.println("digite um numero:");
             int numero=scanner.nextInt();

            if (numero<0){
                System.out.println("FIM");
                break;
            }

            System.out.println("Tabuada de " + numero + ":");

            for (int i = 1;i <= 10; i++){
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
