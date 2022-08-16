import java.util.Scanner;

public class Aula0908 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int qs1 = prompt.nextInt(), qs2 = qs1;

        //verificando se o número é positivo ou negativo:
        if(qs1 >= 0){
            System.out.println(qs1 + " é positivo.");
        } else {
            System.out.println(qs1 + " é negativo.");
        }

        //verificando se o número é par ou ímpar:
        if(qs2 % 2 == 0){
            System.out.println(qs2 + " é par.");
        } else {
            System.out.println(qs2 + " é ímpar.");
        }

        //recebendo as notas:
        int n1 = prompt.nextInt(), n2 = prompt.nextInt(), n3 = prompt.nextInt();

        //calculando a média:
        var media = (n1 + n2 + n3)/3;

        //verificando se foi aprovado(a) ou não:
        if(media >= 5){
            System.out.println("Aluno(a) aprovado(a) com nota: " + media);
        } else {
            System.out.println("Aluno(a) reprovado(a) devido à nota " + media);
        }
    }
}