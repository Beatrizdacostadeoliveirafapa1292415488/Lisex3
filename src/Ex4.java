import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("digite dois numeros:");

        int num1,num2;

        while (true){
            System.out.print("Digite o primeiro numero: ");
             num1 = scanner.nextInt();
            System.out.print("Digite o segundo numero: ");
             num2= scanner.nextInt();

             if (num1==num2){
                 System.out.println("os numeros são iguais.");
                 break;
             }else if (num1<num2){
                 System.out.println("os numeros digitado em crescente.");
             }else {
                 System.out.println("os numeros digitado em decescente.");
             }

        }
    }
}
