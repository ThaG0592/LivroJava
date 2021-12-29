// fig 2.20 Comparison.java
//Imprimindo multiplas linhas de texto com uma unica instrução


public class Calculate {
    //o metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
       
        int sum, x;

        x = 1;
        sum = 0;

        while (x<=10) {
            sum += x;
            ++x;
            
        }
        System.out.println("The sum is: " + sum);
              
    } //fim do main
    
}// fim da classe
