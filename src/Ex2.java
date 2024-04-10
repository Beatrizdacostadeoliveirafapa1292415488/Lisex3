import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2;
        System.out.print("digite o primeiro numero:");
        num1=scanner.nextInt();
        System.out.print("digite o segundo numero(maior do que o primeiro):");
        num2=scanner.nextInt();

        int sdivisivelpor5=0;
        int soma=0;

        for (int i =num1; i <=num2;i++){
            if (i% 5==0){
                soma+=i;
                System.out.println(i+"e divisivel por 5:");
            }
        }System.out.println("A soma do numeros divisiveis por 5 entre"+num1+"a"+num2+"e"+soma);


    }
}
