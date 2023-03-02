import java.time.LocalDate;

public class Human implements EveningActivity{
    private String name;
    private LocalDate birthDate;

    public Human(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
      return name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
   
    @Override
    public String toString() {
        return 
            " name = " + getName()+
            ", birthDate = " + getBirthDate();
    }
    public void activity(){
        System.out.println("Вечерние активности");
    }
}