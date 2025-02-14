import java.sql.SQLOutput;
import java.util.Scanner;

public class Alg1 {
    public void trocavalores(){
        System.out.println("Digite o valor de a");
        Scanner prompt = new Scanner(System.in);
        int a = prompt.nextInt();
        System.out.println("Digite o valor de b");
        int b = prompt.nextInt();
        System.out.println("ANTES DA TROCA:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        int aux = a;
        a = b;
        b = aux;
        System.out.println("DEPOIS DA TROCA:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
