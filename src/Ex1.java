import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero;
         System.out.print("digite um numero positivo:");
         numero= scanner.nextInt();

         int totalpar= 0;
         int totalimpar=0;

         int somapar=0;
         int somaimpar=0;


         for (int i=1; i<= numero;i++){
             if(i % 2 ==0){
                 totalpar++;
                 somapar+=i;
             }else {
                 totalimpar++;
                 somaimpar+=i;
             }
         }
         System.out.println("total de numeros pares:"+totalpar);
         System.out.println("soma de numeros pares:"+somapar);
         System.out.println("total de numeros impares:"+totalimpar);
         System.out.println("soma de numeros impares:"+somaimpar);



    }
}
