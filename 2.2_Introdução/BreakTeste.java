// fig 5.5 Soma.java
//Repetição controlada por estrutura for

//Pacotes de extenção do Java
import javax.swing.JOptionPane;

public class BreakTeste{
        //metodo main começa a execução do applicativo Java
       public static void main(String[] args) {
        String output = " ";
        int count;

        //repete 10 vezes
        for(count = 1; count <=10; count++){

            //se a contagem dos igual a 4, terminar o laço
            if(count == 5) break; // interrompe o laço

            output += count + " ";
        }
        
        output += "\nBroke out of laço at count = " +count;
        JOptionPane.showMessageDialog(null, output);
        
        System.exit(0); // termino do aplicativo

        }// termino do main

       
     
       
}// fim da classe
