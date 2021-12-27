// fig 2.20 Comparison.java
//Imprimindo multiplas linhas de texto com uma unica instrução

//pacote de extenção do java
import javax.swing.JOptionPane; // importa a classe JOptonPane


public class Comparison {
    //o metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
            String firstNumber;     //primeiro numero inserido pelo usuario
            String secondNumber;    //segundo numero inserido pelo usuario
            String result;          //um conteude de saida       
            int number1;            //primeiro numero a somar
            int number2;            //segundo numero a somar
          
        //lê o primeiro numero do usuario como String
        firstNumber = 
            JOptionPane.showInputDialog("Enter first integer");
        
        //lê o segundo numero do usuario como String
        secondNumber = 
        JOptionPane.showInputDialog("Enter second integer");

        //converter os numeros do tipo string em tipo int
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        // inicializar o resultado como vazio
        result = " ";
        if(number1 == number2)
        result = result + number1 + "==" + number2;

        if(number1 != number2)
        result = result + number1 + "!=" + number2;

        if(number1 < number2)
        result = result + "n" + number1 + "<" + number2;

        if(number1 > number2)
        result = result + "n" + number1 + ">" + number2;

        if(number1 <= number2)
        result = result + "n" + number1 + "<=" + number2;

        if(number1 >= number2)
        result = result + "n" + number1 + ">=" + number2;
    
        //Exiba resultados
        JOptionPane.showMessageDialog(
           null, result, "Comparision Results",
           JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); //Termino do aplicativo
        
    } //fim do main
    
}// fim da classe
