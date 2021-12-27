// fig 2.20 Comparison.java
//Imprimindo multiplas linhas de texto com uma unica instrução

//pacote de extenção do java
import javax.swing.JOptionPane; // importa a classe JOptonPane


public class Product {
    //o metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
            int x, y, z, result;
            String xVal, yVal, zVal;

            xVal = JOptionPane.showInputDialog
                ("Enter first integer: ");
        
            yVal = JOptionPane.showInputDialog
                ("Enter second integer: ");
            
            zVal = JOptionPane.showInputDialog
                ("Enter third integer: ");

            x = Integer.parseInt(xVal);
            y = Integer.parseInt(yVal);
            z = Integer.parseInt(zVal);

            result = x * y *z;
            JOptionPane.showMessageDialog(
                null, "The product is" + result);
            
            
        System.exit(0); //Termino do aplicativo
        
    } //fim do main
    
}// fim da classe
