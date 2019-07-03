/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodals;

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
}
