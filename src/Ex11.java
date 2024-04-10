import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int thomens=0;
        int tmulheres=0;
        int ihomem=0;
        int imulher=0;
        int idade;

        while (true){
            System.out.print("Digite o sexo: ");
            char sexo = scanner.next().charAt(0);

            if (sexo!='M' && sexo!='F'){
                System.out.println("FIM");
                break;
            }

            System.out.print("digite a sua idade:");
            idade=scanner.next().charAt(0);

            if (sexo=='M'){
                ihomem+= idade;
                thomens++;
            }else {
                imulher+=idade;
                tmulheres++;
            }

        }double mhomens,mmulheres;
        mhomens=thomens==0?0:thomens;
        mmulheres=tmulheres==0?0:tmulheres;

        System.out.println("idade média dos homens:"+mhomens);
        System.out.println("idade media das mulheres:"+mmulheres);


    }
}
