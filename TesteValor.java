import javax.swing.JOptionPane;

public class TesteValor {
    public static void main (String[] args) {
        
        int n = Integer.parseInt (

            JOptionPane.showInputDialog ("Digite um inteiro: ")
        );

        if (n >= 100) {

            JOptionPane.showMessageDialog (null, n + " maior ou igual a 100");
        }

        else {

            JOptionPane.showMessageDialog (null, n + " menor que 100");
        }
    }
}