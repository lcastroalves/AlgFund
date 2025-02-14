import java.util.Scanner;

public class Alg5 {
    public long fatorial(int n) {
        long fator = 1;
        for (int i = 1; i <= n; i++) {
            fator = i * fator;
        }
        return fator;
    }
    public void serieInfinita(){
        System.out.println("Número de termos: ");
        Scanner prompt = new Scanner(System.in);
        short n = prompt.nextShort();
        System.out.println("Valor de X: ");
        byte x = prompt.nextByte();
        double termo;
        double s = 0;
        short i = -1;
        byte sinal = -1;
        for (int j = 1; j <= n; j++) {
            i = (short)(i + 2);
            sinal = (byte)(-sinal);
            termo = sinal * Math.pow(x, i) / fatorial(i);
            s = s + termo;
        }
        System.out.println("S = " + s);
    }
}
