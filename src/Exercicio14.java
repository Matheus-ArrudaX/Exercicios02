import javax.swing.*;

public class Exercicio14 {
    public static void main(String[] args) {

        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador: "));

        if (idade >= 0 && idade <= 10) {
            System.out.println("O nadador é infantil");

        } else if (idade >= 11 && idade <= 14) {
            System.out.println("O nadador é junior");

        } else if (idade >= 15 && idade <= 20) {
            System.out.println("O nadador é adolescente");

        } else if (idade >= 21 && idade <= 35) {
            System.out.println("O nadador é jovem");

        } else if (idade > 35) {
            System.out.println("O nadador é master");
            
        }

    }

    }





