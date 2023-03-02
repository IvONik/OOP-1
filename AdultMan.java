import java.time.LocalDate;

public class AdultMan extends Human implements EveningActivity{

    public AdultMan(String name, LocalDate birthDate) {
        super(name, birthDate);
        //TODO Auto-generated constructor stub
    }

    public void activity(){
        System.out.println("Читаем книги, вяжем носки");
    }
    
}
