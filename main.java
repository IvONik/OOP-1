import java.time.LocalDate;
import java.util.ArrayList;
public class main{
  public static void main(String[] args) {

    Human pavel = new Human("Павел", LocalDate.of(1983, 1, 1));
    Human sveta = new Human("Света", LocalDate.of(1980, 2, 23));
    Human olga = new Human("Ольга", LocalDate.of(2008, 4, 14));
    Human sergey = new Human("Сергей", LocalDate.of(1985, 6, 3));
    Human nastya = new Human("Настя", LocalDate.of(1987, 9, 9));
    Human dima = new Human("Дима", LocalDate.of(2011, 3, 17));
    Human kostya = new Human("Костя", LocalDate.of(2015, 10, 1));
    Human kolya = new Human("Коля", LocalDate.of(1947, 11, 1));
    Human natasha = new Human("Наташа", LocalDate.of(1950, 7, 23));
    
   
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
    System.out.println(new Research(tree).spend(sergey, Relationship.parent));
    System.out.println("Супруг/а Сергея");
    System.out.println(new Research(tree).spend(sergey, Relationship.wifeOrHusbent));    
    
  }

}

class Research {
  ArrayList<Node> tree;

  public Research(Tree tree2) {
    tree = Tree.getTree();
  }

  public ArrayList<Human> spend(Human human, Relationship re) { 
    var result = new ArrayList<Human>();

    for (Node elem : tree) {
      if (elem.human1.getName()== human.getName() && elem.re == re) {
        result.add(elem.human2);
      }
    }

    return result;
  }
}


