//Fig 5.19: LogicalOperators
//Demonstrando operadores logicos

// Pacote de extenção de area
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;

public class LogicalOperators {
    //metodo mains inicia a execuçao do aplicativo
    public static void main(String args []) {
        //criar JtextArea para exibir os resultados
        JTextArea outpuArea = new JTextArea(17,20);

        //acrescentar JtextArea a um JsclollPane para que o ususario possa rolar
        //para ver os resultados
        JScrollPane scrollPane = new JScrollPane(outpuArea);
        
        String output =
        // criar tabela verdadepara o operador
        output +=   "Logical AND(&&)" + 
                    "\nfalse && false: " + (false && false) +
                    "\nfalse && true: " + (false && true) +
                    "\ntrue && false: " + (true && false) +
                    "\ntrue && true: " + (true && true);
        
        //crie a tabela verdade para operador ||
        output +=   "\n\nLogical OR(||)" +
                    "\nfalse || false: " + (false || false) +
                    "\nfalse || true: " + (false || true) +
                    "\ntrue || false: " + (true || false) +
                    "\ntrue || true: " + (true || true);
        
        //crie a tabela verdade para operador &
        output +=   "\n\nBoolean Logical AND(&)" +
                    "\nfalse & false: " + (false & false) +
                    "\nfalse & true: " + (false & true) +
                    "\ntrue & false: " + (true & false) +
                    "\ntrue & true: " + (true & true);

        //crie a tabela verdade para operador |
        output +=   "\n\nBooleam Logical OR(|)" +
                    "\nfalse | false: " + (false | false) +
                    "\nfalse | true: " + (false | true) +
                    "\ntrue | false: " + (true | false) +
                    "\ntrue | true: " + (true | true);

        //crie a tabela verdade para operador ^
        output +=   "\n\nBooleam Logical exclusive OR(^)" +
                    "\nfalse ^ false: " + (false ^ false) +
                    "\nfalse ^ true: " + (false ^ true) +
                    "\ntrue ^ false: " + (true ^ false) +
                    "\ntrue ^ true: " + (true ^ true);

        //crie a tabela verdade para operador !
        output +=   "\n\nLogical NOT(!)" +
                    "\n! false: " + (! false) +
                    "\n! true: " + (!true);

        outpuArea.setText(output); //coloca os resultados na JTextArea

        JOptionPane.showMessageDialog(null, scrollPane, 
        "Truth Tables", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); // termina o aplicativo

    } // fim do main
    
}// fim da classe
