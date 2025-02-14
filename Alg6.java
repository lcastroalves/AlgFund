import java.util.Scanner;

public class Alg6 {
    public void fibonacci(){
        System.out.println("Número de termos: ");
        Scanner prompt = new Scanner(System.in);
        int n = prompt.nextInt();
        int a = 0;
        int b = 1;
        int i = 2;
        while(i < n){
            System.out.print(a + ", " + b + ", ");
            a += b;
            b += a;
            i += 2;
        }
        if(i == n) {
            System.out.println(a + ", " + b);
        } else {
            System.out.println(a);
        }
    }
}
