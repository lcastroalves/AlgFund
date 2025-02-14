import java.util.Scanner;

public class Alg2 {
    public void contagem () {
        System.out.println("Número de notas: ");
        Scanner prompt = new Scanner(System.in);
        int n = prompt.nextInt();
        byte nota;
        int contagem = 0;
        int i = 0;
        while (i < n) {
            i++;
            System.out.println("Nota do aluno: ");
            nota = prompt.nextByte();
            if (nota >= 50) {
                contagem++;
            }
        }
        System.out.println("Número de aprovações: " + contagem);
    }
}
