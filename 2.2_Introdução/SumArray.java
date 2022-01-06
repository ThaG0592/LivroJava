import javax.swing.JOptionPane;

//fig 7.6 SumArray.java
//Totaliza os valores dos elementos de um array


public class SumArray {
    //metodo de execução do aplicativo java
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;

        //adiciona o valor de cada elemento a total
        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];            
        }

        JOptionPane.showMessageDialog(null, "Total of array elements: " + total, 
        "Sum the elements of an Array", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    
}
