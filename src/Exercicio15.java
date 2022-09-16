import javax.swing.*;

public class Exercicio15 {
    public static void main(String[] args) {

        double p1, p2, t1, t2, t3, mf;

        p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira nota: "));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda nota: "));
        t1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do primeiro trabalho: "));
        t2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do segundo trabalho: "));
        t3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do terceiro trabalho: "));

        mf = (p1 + p2 + t1 + t2 + t3) /5;

        if (mf >= 6 && mf<= 10) {
        JOptionPane.showMessageDialog(null, "Aprovado: " +mf);
        System.out.println("Aprovado: " +mf);
    
        } else if (mf >= 4 && mf < 6 ) {
         JOptionPane.showMessageDialog(null, "Exame: " +mf);
            System.out.println("Exame: " +mf);
        
        } else if (mf >= 0 && mf < 4) {
            JOptionPane.showMessageDialog(null, "Reprovado: " +mf);
            System.out.println("Reprovado: " +mf);
            
        }

    }

    }
