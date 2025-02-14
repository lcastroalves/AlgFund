import java.util.Scanner;

public class Alg3 {
    public void soma () {
        System.out.println("Quantidade de números:");
        Scanner prompt = new Scanner(System.in);
        int n = prompt.nextInt();
        int numero;
        int soma = 0;
        int i = 0;
        while (i < n) {
            i++;
            System.out.println("Digite o número");
            numero = prompt.nextInt();
            soma = soma + numero;
        }
        System.out.println("Soma = " + soma);
    }
}
