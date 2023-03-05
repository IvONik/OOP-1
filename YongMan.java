import java.io.Serializable;
import java.time.LocalDate;

public class YongMan extends Human implements EveningActivity, Serializable{

    public YongMan(String name, LocalDate birthDate) {
        super(name, birthDate);
       
    }
    
    public void activity(){
        System.out.println("смотрим мультики");
    }
}
