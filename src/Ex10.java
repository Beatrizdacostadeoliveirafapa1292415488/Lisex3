import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero;

        while (true){
            System.out.print("Digite um número  positivo: ");
             numero = scanner.nextInt();

             if (numero==0){
                 System.out.println("FIM");
                 break;
             }for (int i=1;i<=numero;i++){
                 System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
