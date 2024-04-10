public class Ex8 {
    public static void main(String[] args) {
        int contador=0;
        int numero=101;

        System.out.println("os 50 primos maiores que 100 são:");


        while (contador<50){
            if (primo(numero)){
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }public static boolean primo(int numero){
        if (numero <=1){
            return false;
        }
        for (int i =2;i<=Math.sqrt(numero);i++){
            if (numero% i==0){
                return false;
            }
        }return true;


    }
}
