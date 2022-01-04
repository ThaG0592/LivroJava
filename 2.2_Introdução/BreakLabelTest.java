// fig 5.5 Soma.java
//Repetição controlada por estrutura for

//Pacotes de extenção do Java
import javax.swing.JOptionPane;

public class BreakLabelTest {
        //metodo main começa a execução do applicativo Java
       public static void main(String[] args) {
        String output = " ";
     
        stop: { //bloco rotulado

            //conta 10 linhas
            for (int row = 1; row <= 10; row++) {
                
                //conta 5 colunas
                for (int column = 1; column <= 5; column++) {
                    
                    //se a linha for igual 5, pula para i fil do bloco stop
                    if (row == 5) {
                        break stop; // pula para o fim do bloco stop                        
                    }
                    output += "* ";
                }// fim da estrutura interna for
            
            output += "\n";
            }//fim fa estrutura externa for
            
        //a linha seguinte é pulada
        output += "\nLoops terminated normaly";
        }// fim do bloco rotulado
                
        JOptionPane.showMessageDialog(null, 
        output, "Testing breaking with a label", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0); // termino do aplicativo

        }// termino do main     
     
       
}// fim da classe
