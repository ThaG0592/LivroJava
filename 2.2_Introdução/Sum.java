// fig 5.5 Soma.java
//Repetição controlada por estrutura for

//Pacoste de extenção Java
import javax.swing.JOptionPane;

public class Sum{

    //metodo main começa a execução do applicativo Java
    public static void main(String[] args) {
        int sum = 0;

        //soma numeros inteiros de 2 a 100
        for (int number = 2; number <= 100; number += 2) {
            sum += number;            
        }
        //exibe resultados
        JOptionPane.showMessageDialog(null, "The sum is " + sum , 
        "Sum Even Integers from 2 to 100 ", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); // termino do aplicativo
    } // termino do main
       
}// fim da classe
