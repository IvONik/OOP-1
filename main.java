import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ArrayList;
public class main{
  public static void main(String[] args) {

    AdultMan pavel = new AdultMan("Павел", LocalDate.of(1983, 1, 1));
    AdultMan sveta = new AdultMan("Света", LocalDate.of(1980, 2, 23));
    YongMan olga = new YongMan("Ольга", LocalDate.of(2008, 4, 14));
    AdultMan sergey = new AdultMan("Сергей", LocalDate.of(1985, 6, 3));
    AdultMan nastya = new AdultMan("Настя", LocalDate.of(1987, 9, 9));
    YongMan dima = new YongMan("Дима", LocalDate.of(2011, 3, 17));
    YongMan kostya = new YongMan("Костя", LocalDate.of(2015, 10, 1));
    AdultMan kolya = new AdultMan("Коля", LocalDate.of(1947, 11, 1));
    AdultMan natasha = new AdultMan("Наташа", LocalDate.of(1950, 7, 23)); 

    ArrayList<YongMan> yongMans = new ArrayList<>(); 
    yongMans.add(olga);
    yongMans.add(dima);
    yongMans.add(kostya);

    
    Tree tree = new Tree();
     
    tree.addChildren(pavel, olga);
    tree.addChildren(sveta, olga);
    tree.addWifeOrHusbent(pavel, sveta);
    tree.addWifeOrHusbent(sveta, pavel);
    tree.addChildren(sergey, dima);
    tree.addChildren(sergey, kostya);
    tree.addChildren(nastya, dima);
    tree.addChildren(nastya, kostya);    
    tree.addWifeOrHusbent(sergey, nastya);
    tree.addWifeOrHusbent(nastya, sergey);
    tree.addChildren(kolya, sveta);
    tree.addChildren(kolya, sergey);
    tree.addChildren(natasha, sveta);
    tree.addChildren(natasha, sergey);
    tree.addWifeOrHusbent(kolya, natasha);

    System.out.println("дети Сергея");
    System.out.println(new Research(tree).spend(sergey, Relationship.PARENT));
    System.out.println("Супруг/а Сергея");
    System.out.println(new Research(tree).spend(sergey, Relationship.WIFEORHUSBENT));  

    System.out.println("вечерние занятия: ");
    allActivity(dima);    
    allActivity(natasha);
    
    // WriteToFile.write(yongMans);
    WriteToFile.read();
  }

  public static void allActivity(EveningActivity eveningActivity) {
      eveningActivity.activity();
    }

}


