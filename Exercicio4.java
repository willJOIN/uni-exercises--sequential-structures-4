import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, mediaNotas = 0;

        try {
            System.out.println("Digite a primeiro nota:\n");
            Scanner scanner1 = new Scanner(System.in);
            nota1 = scanner1.nextFloat();

            System.out.println("Digite a segunda nota:\n");
            nota2 = scanner1.nextFloat();

            System.out.println("Digite a terceira nota:\n");
            nota3 = scanner1.nextFloat();

            System.out.println("Digite a quarta nota:\n");
            nota4 = scanner1.nextFloat();
            scanner1.close();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar nota1, nota2, nota3 e/ou nota4 no Exercicio4:\n" + ex);
        }

        try {
            mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        } catch (Exception ex) {
            System.out.println("Erro ao pegar mediaNotas no Exercicio4:\n" + ex);
        }

        System.out.println("A media das notas eh:\n" + mediaNotas);
    }
}
