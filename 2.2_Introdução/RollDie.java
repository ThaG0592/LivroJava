import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//Fi 6.7 RadonIntergers.java
//Inteiros aleatorios deslocados  e escalonados

public class RollDie {
    
    //metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        int  frequency1 = 0, frequency2 = 0, frequency3 = 0,
            frequency4 = 0, frequency5 = 0, frequency6 = 0, face;

        //resume os resultados
        for (int roll = 1; roll <= 6000; roll++) {
            face = 1 + (int) (Math.random() * 6);

            //determina valor do lançamento e incrementa contador correspondente
            switch (face) {
                case 1:
                    ++frequency1;
                    break;
            
                case 2:
                    ++frequency2;
                    break;

                case 3:
                    ++frequency3;
                    break;

                case 4:
                    ++frequency4;
                    break;

                case 5:
                    ++frequency5;
                    break;

                case 6:
                    ++frequency6;
                    break;
            }//fim da estrutura swich
            
        }//fim da estrutura for
        JTextArea outArea = new JTextArea();

        outArea.setText("Face \tFrequancy" + 
                            "\n\t" + frequency1 + "\n\t" + frequency2 + 
                            "\n\t" + frequency3 + "\n\t" + frequency4 + 
                            "\n\t" + frequency5 + "\n\t" + frequency6);
        
        JOptionPane.showMessageDialog(null, outArea, "Rolling a Dice 6000 times", 
            JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); //fim aplicativo
    } //termina metodo main
}// fim da classe