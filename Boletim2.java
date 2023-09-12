import javax.swing.JOptionPane;

public class Boletim2 {
    public static void main(String[] args) {

        // ler as duas notas utilizando a classe JOptionPane
        double nota1 = Double.parseDouble (JOptionPane.showInputDialog ("Digite a primeira nota: "));
        double nota2 = Double.parseDouble (JOptionPane.showInputDialog ( "Digite a segunda nota: "));

        //calculo da media
        double media = (nota1 + nota2) / 2;

        //saida com 3 opções
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado com " + media);

        }

        else if (media >= 4) {
            JOptionPane.showMessageDialog(null, "Sua média é de " + media + ", fazer a segunda chamada do exame.");

        }

        else {
            JOptionPane.showMessageDialog(null, "Reprovado com " + media, "Resultado", JOptionPane.ERROR_MESSAGE);

        }
    }
}
// modificar o programa da media para exibir as seguintes mensagens: 
// Se a media for 10 (PARABENS), menor que 10 e maior que 6 (APROVADO), menor que 6 e maior que 3 (RECUPERAÇÂO) 
// e menor que 3 (REPROVADO).