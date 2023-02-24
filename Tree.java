import java.util.ArrayList;
public class Tree{    
    
    private static ArrayList<Node> tree = new ArrayList<>();

    public static ArrayList<Node> getTree() {
        return tree;
    }

    
    public void addChildren(Human parent, Human children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void addWifeOrHusbent(Human human1, Human human2) {
        tree.add(new Node(human1, Relationship.wifeOrHusbent, human2));
    }
  

}  

