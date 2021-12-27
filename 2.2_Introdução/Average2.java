// fig 2.20 Comparison.java
//Imprimindo multiplas linhas de texto com uma unica instrução

//pacote de extenção do java
import java.text.DecimalFormat;

import javax.swing.JOptionPane; // importa a classe JOptonPane


public class Average2 {
    //o metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        int total,          //soma das notas digitadas
            gradeCounter,   //numero de notas lidas
            gradeValue;     //valor da nota
        double avenrage;    // media de todas as notas
        String input;       //nota digitada pelo usuario

        //fase de inicialização
        total = 0;          //limpa total
        gradeCounter = 0;   //prepara para executar laço
        
        //fase processamento 
        //solicita entrada e le a nota digitada
        input = JOptionPane.showInputDialog(
            "Enter Integer Grade, -1 to Quit: ");
        
        //converter string para inteiro
        gradeValue = Integer.parseInt(input);

        while(gradeValue != -1){ 
            
            //adicionar gradeValue ao total
            total = total + gradeValue;
            
            //adicionar 1 a gradeCouter
            gradeCounter = total +gradeCounter;

            //solicita entrada e lê a nota digitada pelo usuário 
            input = JOptionPane.showInputDialog(
                "Enter Integer Grade, -1 to Quite: ");
            
            //converter a nota de String para inteiro
            gradeValue = Integer.parseInt(input);
        } // fim do while

        //frase de conclusão
        DecimalFormat twoDigits = new DecimalFormat("0.00");

        if(gradeCounter !=0){
            avenrage = (double) total / gradeCounter;

            //exibe a media das notas testes
            JOptionPane.showMessageDialog(
                null, "class average is " + twoDigits.format(avenrage), 
                "Class Average ", JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(
                null, "No grades were estared", "class Average",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); //Termino do aplicativo
        
    } //fim do main
    
}// fim da classe
