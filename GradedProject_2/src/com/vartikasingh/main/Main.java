
package com.vartikasingh.main;
import com.vartikasingh.node.Node;
import com.vartikasingh.node.GFG.GFG;

public class Main {
 public static  void main (String[] args, Object headNode)
    {
        GFG.node = new Node(50);
        GFG.node.left = new Node(30);
        GFG.node.right = new Node(60);
        GFG.node.left.left = new Node(10);
        GFG.node.right.left= new Node(55);
       


        int order = 0;
        Object node = null;
		flattenBTToSkewed(node, order);
        traverseRightSkewed(headNode);
    }

private static void traverseRightSkewed(Object headNode) {
	// TODO Auto-generated method stub
	
}

private static void flattenBTToSkewed(Object node, int order) {
	// TODO Auto-generated method stub
	
}

}