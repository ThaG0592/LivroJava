// fig 2.20 Comparison.java
//Imprimindo multiplas linhas de texto com uma unica instrução

//pacote de extenção do java
import javax.swing.JOptionPane; // importa a classe JOptonPane


public class Average1 {
    //o metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        int total,          //soma das notas digitadas
            gradeCounter,   //numero de notas lidas
            gradeValue,     //valor da nota
            averege;        //media das notas
        String grade;       //nota digitada pelo usuario

        //fase de inicialização
        total = 0;          //limpa total
        gradeCounter = 1;   //prepara para executar laço
        
        //fase processamento 
        while(gradeCounter <= 10){ // executa o laço 10 vezes
            
            //solicita entrada e lê a nota digitada pelo usuario
            grade = JOptionPane.showInputDialog(
                "Entrer Integer Grade: ");
            
            //converte o valor da nota
            gradeValue = Integer.parseInt(grade);

            //adicionar gradeValue ao total
            total = total + gradeValue;

            //adicionar valor ao gradeCounter
            gradeCounter = gradeCounter +1;
        } // fim do while

        averege = total /10; // execute divisao inteira

        //exibe a media das notas teste
        JOptionPane.showMessageDialog(
            null, "Class averge is " + averege, "Class Average", 
            JOptionPane.INFORMATION_MESSAGE);
            
        System.exit(0); //Termino do aplicativo
        
    } //fim do main
    
}// fim da classe
