// fig 5.5 Soma.java
//Repetição controlada por estrutura for

//Pacoste de nucleo do Java
import java.text.NumberFormat;
import java.util.Locale;

//Pacotes de extenção do Java
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interest{

    //metodo main começa a execução do applicativo Java
    public static void main(String[] args) {
        double amount, principal = 1000.0, rate = 0.05;

        //criar Decimalformat para formatar numeros em ponto flutuante 
        //com dois digitos a direita do ponto decimal
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        
        //criar Jtext para exibir dados de saida
        JTextArea outpuTextArea = new JTextArea();

        //define primeira linha do texto em outputTextArea
        outpuTextArea.setText("Year \tAmount on deposit\n");

        //calcula o novo valos para cada um dos dez anos
        for(int year = 1; year <=10; year ++){
            //calcule o novo valor para cada um dos dez anos
            amount = principal * Math.pow(1.0 + rate, year);
            
            //acrescente uma linha de texto a outputTextArea
            outpuTextArea.append(year + "\t" +
                moneyFormat.format(amount) + "\n");

        }//fim da estrutura for

        //exibe os resultados
        JOptionPane.showMessageDialog(null, outpuTextArea,
         "compound Interest", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); // termino do aplicativo
    } // termino do main
       
}// fim da classe
