import javax.swing.JOptionPane;

public class TimeTest4{

    //testa construtores da classe Time2
    public static void main(String[] args) {
        
        Time2 t1,t2,t3,t4,t5,t6;
        t1 = new Time2();               // 00:00:00
        t2 = new Time2(2);              // 02:00:00
        t3 = new Time2(21,34);          // 21:34:00
        t4 = new Time2(12,25,42);       // 12:25:42
        t5 = new Time2();               // 00:00:00
        t6 = new Time2(t4);             // 12:25:42

        String  output = "Constructed with: " +
                "\nt1: all arguments defaulted" +
                "\n      " + t1.toUniversaçString() +
                "\n      " + t1.toString();

        output +=   "\nt2: hour specifcied; minute and" + 
                    "secound defaulted" + 
                    "\n      " + t2.toUniversaçString()+
                    "\n      " + t2.toString();
        
        output +=   "\nt3: hour and minute specified" + 
                    "secound defaulted" + 
                    "\n      " + t3.toUniversaçString()+
                    "\n      " + t3.toString();
        
        output +=   "\nt4: hour, minute and secound specified" + 
                    "\n      " + t4.toUniversaçString()+
                    "\n      " + t4.toString();
    
        output +=   "\nt5: all invalid values specified" + 
                    "\n      " + t5.toUniversaçString()+
                    "\n      " + t5.toString();
        
        output +=   "\nt6: Time2 object t4 specified" +
                    "\n      " + t6.toUniversaçString()+
                    "\n      " + t6.toString();

        JOptionPane.showMessageDialog(null, output, 
        "Demonstrating Overloaded Constructors", 
        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
} // fim da classe TimeTest4