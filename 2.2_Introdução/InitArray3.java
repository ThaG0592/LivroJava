import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//fig 7.3 IniyArray
//criando um array


public class InitArray3 {
    //metodo de execução do aplicativo java
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        int array[] = {32,27,64,18,95,14,90,70,60,37};            //declara referencia para o array

        array = new int [ARRAY_SIZE];

        //acrescenta o valor de cada elemento do array ao String output
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        String output = "Subscript\tValue\n";

        for (int counter = 0; counter < array.length; counter++) {
            output += counter + "\t" + array[counter] + "\n";            
        }

        JTextArea outpuArea = new JTextArea();
        outpuArea.setText(output);

        JOptionPane.showMessageDialog( null, outpuArea, 
        "Inicializing to Even Numbers trom 2 to 20", 
        JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);            
        
    };

    
}
