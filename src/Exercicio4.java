import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio4 {
    public static void main(String[] args) {

        double a, b;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        if (a < b) {
            JOptionPane.showMessageDialog(null, +a + " é menor que " + b);
            System.out.println(+a + " é menor que " + b);
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        } else if (b < a) {
            JOptionPane.showMessageDialog(null, +b + " é menor que " + a);
            System.out.println(+b + " é menor que " + a);
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        }
        {

        }
    }
}