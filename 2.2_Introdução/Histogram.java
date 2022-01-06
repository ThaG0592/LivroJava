import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//fig 7.6 SumArray.java
//Totaliza os valores dos elementos de um array


public class Histogram {
    //metodo de execução do aplicativo java
    public static void main(String[] args) {
        int array [] = {19,3,15,7,11,9,13,5,17,1};

        String output = "Element\tValue\tHistogram";

        //para cada elemento do array, desenha uma barra no histograma
        for (int counter = 0; counter < array.length; counter++) {
            output +=
                "\n" + counter + "\t" + array[counter] + "\t";
            
            //imprime uma barra de asteriscos
            for (int stars = 0; stars < array[counter]; stars++) {
                output += "*";                
            }
        }

        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea, 
        "Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    
}
