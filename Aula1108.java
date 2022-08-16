import java.util.Scanner;

public class Aula1108 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int a=0, b=1, c;

        //Definindo o número de termos:
        int qs1 = prompt.nextInt();

        //Definindo a quantidade de vezes do loop e as operações necessárias:
        for (int n=1; n<=qs1; n++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}