import javax.swing.JOptionPane;

//Fi 6.7 RadonIntergers.java
//Inteiros aleatorios deslocados  e escalonados

public class RadomIntegers {
    
    //metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        int value;
        String output = "";

        //repete 20 vezes
        for (int counter = 1; counter <= 20; counter++) {
            value = 1 + (int) (Math.random() * 6);
            output += value + "";

            //se counter é divisivel por 5, acrescentar nova linha ao String output
            if (counter % 5 == 0) {
                output += "\n";                
            }
        } // fim da estrutura for 

        JOptionPane.showMessageDialog(null, output, "20 Random numbers from 1 to 6", 
        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); // termina aplicativo
    } //termina metodo main
}// fim da classe