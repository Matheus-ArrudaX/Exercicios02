import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {

        double p1, p2, nota;

        p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota p1: "));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota p2: "));
        nota = (p1 + p2) / 2;

        if (nota > 6) {
            JOptionPane.showMessageDialog(null, "Foi aprovado: " + nota);
            System.out.println("Foi aprovado: " + nota);
        } else {
            JOptionPane.showMessageDialog(null, "Foi reprovado: " + nota);
            System.out.println("Foi reprovado: " + nota);


        }
    }
}









