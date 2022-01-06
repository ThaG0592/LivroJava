import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//fig 7.3 IniyArray
//criando um array


public class InitArray2 {
    //metodo de execução do aplicativo java
    public static void main(String[] args) {
        int array[] = {32,27,64,18,95,14,90,70,60,37};            //declara referencia para o array

        String output = "Subscript\tValue\n";

        //acrescenta o valor de cada elemento do array ao String output
        for (int counter = 0; counter < array.length; counter++) {
            output += counter + "\t" + array[counter] + "\n";
        }
        JTextArea outArea = new JTextArea();
        outArea.setText(output);

        JOptionPane.showMessageDialog(null, outArea, 
        "Initializing an Array on int Values", 
        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);            
        
    };

    
}
