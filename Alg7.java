import java.util.Scanner;

public class Alg7 {
    public void iversao() {
        System.out.println("Número inteiro positivo: ");
        Scanner prompt = new Scanner(System.in);
        double n = prompt.nextDouble();
        double inverso = 0;
        double digito;
        while (n > 0) {
            digito = n % 10;
            inverso = (inverso * 10 + digito);
            n = Math.floor(n / 10);
        }
        System.out.println("Número inverso: " + inverso);
    }
}
