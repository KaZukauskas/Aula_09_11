import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        //ler duas notas do usuario
        // declarar o objeto scanner e instanciar

        Scanner scanner = new Scanner (System.in);

        System.out.print ("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print ("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // processamento: calculo da media
        double media = (nota1 + nota2) / 2;

        // saída: depende da media
        if (media >= 6.0) {
            System.out.println("Aprovado com " + media);

        }

        else {
            System.out.println("Reprovado com " + media);

        }

        scanner.close(); // liberação de memoria
        
    }
}