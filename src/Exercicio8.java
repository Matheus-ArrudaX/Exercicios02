import javax.swing.*;

public class Exercicio8 {
    public static void main(String[] args) {

        double b1, h1, a1, b2, h2, a2, b3, h3, a3;

        b1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triãngulo 1: "));
        h1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triãngulo 1: "));
        a1 = (b1 * h1) / 2;
        JOptionPane.showMessageDialog(null, "A área do triângulo 1 é: " + a1);
        System.out.println("A área do triângulo 1 é: " + a1);

        b2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triãngulo 2: "));
        h2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triãngulo 2: "));
        a2 = (b2 * h2) / 2;
        JOptionPane.showMessageDialog(null, "A área do triângulo 2 é: " + a2);
        System.out.println("A área do triângulo 2 é: " + a2);

        b3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triãngulo 3: "));
        h3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triãngulo 3: "));
        a3 = (b3 * h3) / 2;
        JOptionPane.showMessageDialog(null, "A área do triângulo 3 é: " + a3);
        System.out.println("A área do triângulo 3 é: " + a3);

        {
        }
        if (a1 > a2) {

            JOptionPane.showMessageDialog(null, "A maior área é " + a1);
            System.out.println("A maior área é " + a1);

        }  if (a1 > a3) {

            JOptionPane.showMessageDialog(null, "A maior área é " + a1);
            System.out.println("A maior área é " + a1);


        }  if (a2 > a1) {


        JOptionPane.showMessageDialog(null, "A maior área é " + a2);
            System.out.println("A maior área é " + a2);

        }  if (a2 > a3) {

            JOptionPane.showMessageDialog(null, "A maior área é " + a2);
                    System.out.println("A maior área é " + a2);


                }  if (a3 > a1) {

            JOptionPane.showMessageDialog(null, "A maior área é " + a3);
            System.out.println("A maior área é " + a3);

        }

        if (a3 > a2) {
            JOptionPane.showMessageDialog(null, "A maior área é " + a3);
            System.out.println("A maior área é " + a3);


        }


    }

    }




