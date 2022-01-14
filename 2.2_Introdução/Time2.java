import java.text.DecimalFormat;

public class Time2 extends Object{
    private int hour;       //0 - 23
    private int minute;     //0 - 59
    private int second;     //0 - 59

    //Construtor do Time2 inicializa cada variavel de instancia
    //com zero. Assegura que object Time inicia em um
    //estado consistente
    public Time2(){
        setTime(0,0,0);
    }
    
    //Construtor no Time2, a hora é informada,
    //minuto e segundo são colocados em zero default
    public Time2(int h){
        setTime(h,0,0);
    }
    
    //Construtor no Time2, hora e  minuto é informada,
    //segundo e segundo são colocados em zero default 
    public Time2(int h, int m){
        setTime(h,m,0);
    }

    //Construtor no Time2, hora e  minuto e segundo é informada,
    public Time2(int h, int m, int s){
        setTime(h,m,s);
    }

    //Construtor no Time2, outro objeto Time2 fornecido
    public Time2(Time2 time){
        setTime(time.hour, time.minute, time.second);
    }

    //Configura um novo valor da hora, usando formato da hora universal.
    //Faz o teste de validade de dados. Configura valores invalidos como zero.
    public void setTime(int h, int m, int s){
        hour = ((h >= 0 && h < 24 ) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0 );
        second = ((s >= 0 && s < 60) ? s : 0 );
    }

    //converte para string no formato de hora universal
    public String toUniversaçString(){
        DecimalFormat twoDigits = new DecimalFormat("00");
        return  twoDigits.format( hour ) + ":" +
                twoDigits.format(minute) + ":" +
                twoDigits.format(second);
    }

    //converte para String o formato de hora padrão
    public String toString(){
        DecimalFormat twoDigits = new DecimalFormat("00");
        return  ((hour == 12 || hour == 0) ? 12 : hour % 12) +
                ":" + twoDigits.format(minute) +
                ":" + twoDigits.format(second) +
                (hour < 12 ? "AM" : "PM");
    }


    
}// fim da classe Time2
