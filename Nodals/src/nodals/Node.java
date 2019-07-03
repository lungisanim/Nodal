/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lungisanin
 */
public class Node {
    int id;
    int parentID;
    String label;
    
    public Node(int id, int parentId, String label){
        this.id = id;
        this.parentID = parentId;
        this.label = label;
    }
    
    ArrayList<Node> theList = new ArrayList<>();
    
    public void addNodes(int id, int parentId, String label){
        theList.forEach((Node item) -> {
            theList.add(new Node(item.id, item.parentID, item.label));
        });
    }
    
    //output NodeA (id: 7000, parentID: 0)
    public void printOutput(){
        for (int i = 0; i < theList.size(); i++) {
            Node node = theList.get(i);
            outputStructure(node);
        }
    }
    //\t
    public void outputStructure(Node node){
        if (hasParent(node)) {
            System.out.println("  " + node.label + " (" + "id: " + node.id + ", parentId: " + node.parentID  + ")");
        }
        System.out.println(node.label + " (" + "id: " + node.id + ", parentId: " + node.parentID  + ")");
    }
    
   public boolean hasParent(Node node)
   {
       return theList.stream().anyMatch((nodes) -> (nodes.parentID == node.id));
   }
}
