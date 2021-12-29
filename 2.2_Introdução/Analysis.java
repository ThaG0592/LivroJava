// fig 2.20 Comparison.java
//Imprimindo multiplas linhas de texto com uma unica instrução


import javax.swing.JOptionPane; // importa a classe JOptonPane


public class Analysis {
    //o metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        //metodo main inicia a execução do aplicativo Java
        int passes = 0,     //numero de aprovações
            failures = 0,   //numero de reprovações
            student = 1,    //contador de alunos
            result;         //um resultado do exame
        String  input,      //valor digitado pelo ususario
                output;     //string de saida

        //processa 10 aluno = laço controlado por contador
        while (student <=10) {

            //obtem resultado do usuario
            input = JOptionPane.showInputDialog(
                "Enter result(l=pass, 2=fail");
            
            //converter o resultado para int
            result = Integer.parseInt(input);

            //processar o resultad
            if (result == 1) {
                passes = passes +1;
                
            } else {
                failures = failures+1;
                student = student+1;                
            }         
        }

        //fase de conclusão
        output = "Passed: " + passes + "\nFailed: " + failures;

        if (passes > 8) {

            output = output + "\nRaise Tuition";                       
        }
        JOptionPane.showMessageDialog(null, output, "Analysis of Examination Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); //Termino do aplicativo
        
    } //fim do main
    
}// fim da classe
