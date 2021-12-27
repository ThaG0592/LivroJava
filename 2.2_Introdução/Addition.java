// fig 2.9 Addition.java
//Imprimindo multiplas linhas de texto com uma unica instrução

//pacote de extenção do java
import javax.swing.JOptionPane; // importa a classe JOptonPane

public class Addition {
    //o metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
            String firstNumber, //primeiro numero inserido pelo usuario
            secondNumber;       //segundo numero inserido pelo usuario
            int number1;        //primeiro numero a somar
            int number2;        //segundo numero a somar
            int sum;            //soma do number1 com o number2

        //lê o primeiro numero do usuario como String
        firstNumber = 
            JOptionPane.showInputDialog("Enter first integer");
        
        //lê o segundo numero do usuario como String
        secondNumber = 
        JOptionPane.showInputDialog("Enter second integer");

        //converter os numeros do tipo string em tipo int
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        // adiciona os numeros
        sum = number1 + number2;

        // exibe o resultado
        JOptionPane.showMessageDialog(
            null, "The sum is" + sum +"Results" );

        System.exit(0); // termino do aplicativo
        
    } //fim do main
    
}// fim da classe
