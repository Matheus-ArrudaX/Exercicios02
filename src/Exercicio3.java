import javax.swing.*;
import java.sql.SQLOutput;

public class Exercicio3 {
    public static void main(String[] args) {

        double a, b;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        if (a > b) {
            JOptionPane.showMessageDialog(null, + a + "é maior que " + b);
            System.out.println(+ a + "é maior que" + b);
        } else if (a < b) {
            JOptionPane.showMessageDialog(null, + b + "é maior que " + a);
            System.out.println(+ b + "é maior que " + a);

        }


    }
}
