import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//fig 7.6 SumArray.java
//Totaliza os valores dos elementos de um array


public class RollDieArray {
    //metodo de execução do aplicativo java
    public static void main(String[] args) {
        int face, frequecy[] = new int[7];

        //lançar o dado 6000 vezes
        for (int roll = 1; roll < 6000; roll++) {
           face = 1 + (int) (Math.random() * 6);

           //usa o valor da face comoc subscrito para o array de frequencias
           ++frequecy[face];
        }

        String output = "Face\tFrequncy";

        //acrescenta frequencia ao String output
        for (face = 1; face < frequecy.length; face++) {
            output += "\n" + face + "\t" + frequecy[face];            
        }

        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea, 
        "Rolling a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    
}
