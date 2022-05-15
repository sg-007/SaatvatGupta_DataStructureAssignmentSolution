package com.gl.main;
import com.gl.model.RightSkewed;

public class Main_BST {

	public static void main (String[] args)
	{
		RightSkewed tree = new RightSkewed();
		tree.node = tree.newNode(30);
		tree.node.left = tree.newNode(20);
        tree.node.right = tree.newNode(60);
        tree.node.left.left = tree.newNode(10);
        tree.node.right.left = tree.newNode(55);
        
		tree.rightskew(tree.node);
		tree.traversal(tree.head);
	}
}
