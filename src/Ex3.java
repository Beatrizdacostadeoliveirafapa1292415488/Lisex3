import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero;
        System.out.print("digite um numero positivo:");
        numero= scanner.nextInt();

        int somadivisor=0;

        for (int i=1; i<numero; i++){
            if (numero% i==0){
                somadivisor+= i;
            }
        } if (somadivisor==numero){
            System.out.println(numero+"é um numero perfeito.");
        }else{
            System.out.println(numero+"não é um numero perfeito.");
        }
    }
}
