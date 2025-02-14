import java.util.Scanner;

public class Alg4 {
    public void fatorial(){
        System.out.println("Número que você deseja saber o fatorial: ");
        Scanner prompt = new Scanner(System.in);
        int n = prompt.nextInt();
        int fator = 1;
        for (int i = 1; i <= n; i++) {
            fator = i * fator;
        }
        System.out.println("Fatorial = " + fator);
    }
}
