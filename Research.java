import java.util.ArrayList;

public class Research {
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
