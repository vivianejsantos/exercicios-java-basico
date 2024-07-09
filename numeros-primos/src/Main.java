import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeroInicial, numeroFinal;
        ArrayList<Integer> primos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com número inicial");
        numeroInicial= sc.nextInt();
        System.out.println("Entre com número Final");
        numeroFinal= sc.nextInt();

        for(int i =1; i <= numeroFinal;i++){
            if(ehprimo(i)==true){  // retorno do método que verifica se é primo
                primos.add(i); 
            }
        }
        System.out.println(primos);

        }
// método verifica se o numero é primo
        private static boolean ehprimo(int n){
        int contador = 0;
        for(int i =1; i <=n; i++){
            if(n%i==0){
                contador+=1;
            }
        }if (contador==2)
            return true;
        else
            return false;
        }
}