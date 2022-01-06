import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//fig 7.6 SumArray.java
//Totaliza os valores dos elementos de um array


public class StudentPoll {
    //metodo de execução do aplicativo java
    public static void main(String[] args) {
        int responses [] =  {1,2,6,4,8,5,9,7,8,10,
                             1,6,3,8,6,10,3,8,2,7,
                             6,5,7,6,8,6,7,5,6,6,
                            5,6,7,5,6,4,8,6,8,10};

        int frequecy[] = new int[11];

        //para cada resposta, seleciona o valaro de um elemento
        //do array reponses e usa aquele valor como subscrito do
        //array frequency para determinar o elemento incrementar
        for (int ansewer = 0; ansewer < responses.length; ansewer++) {
           ++frequecy[responses[ansewer]];
        }

        String output = "Rating\tFrequncy\n";
        
        //acrescenta frequencia ao String output
        for (int rating = 1; rating < frequecy.length; rating++) {
            output += rating + "\t" + frequecy[rating] + "\n";            
        }

        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea, 
        "Student Poll Program", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    
}
