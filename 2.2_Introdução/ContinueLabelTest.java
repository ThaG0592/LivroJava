// fig 5.5 Soma.java
//Repetição controlada por estrutura for

//Pacotes de extenção do Java
import javax.swing.JOptionPane;

public class ContinueLabelTest {
        //metodo main começa a execução do applicativo Java
       public static void main(String[] args) {
        String output = " ";   
     
        nextRow:  //bloco rotulado

            //conta 10 linhas
            for (int row = 1; row <= 10; row++) {
                output += "\n";

                //conta 10 colunas
                for (int column = 1; column <= 10; column++) {
                    
                    //se a coluna for maior que a linha iniciar proxima linha
                    if (column > row) {
                        continue nextRow; // pula para o fim do bloco stop                        
                    }
                    output += "* ";
                }// fim da estrutura interna for
            
            }//fim fa estrutura externa for
            
               
                
        JOptionPane.showMessageDialog(null, 
        output, "Testing continue with a label", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0); // termino do aplicativo

        }// termino do main     
     
       
}// fim da classe
