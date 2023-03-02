import java.time.LocalDate;

public class YongMan extends Human implements EveningActivity{

    public YongMan(String name, LocalDate birthDate) {
        super(name, birthDate);
        //TODO Auto-generated constructor stub
    }
    
    public void activity(){
        System.out.println("смотрим мультики");
    }
}
