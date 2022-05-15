package com.gl.model;

public class RightSkewed {

	public class Node {
		public int key;
		public Node left, right;
	}

	public Node newNode(int data) {
		Node temp = new Node();
		temp.key = data;
		temp.left = null;
		temp.right = null;
		
		return temp;
		}
	
	public Node node, prevNode = null, headNode = null;
	
		public void rightskew(Node root) {
			if(root == null) {
				return;
			}
				rightskew(root.left);
			
			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			}
			else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
				rightskew(root.right);
		}

		public void traverseRightSkewed(Node root) {
			if(root == null) {
				return;
			}
			System.out.print(root.key + " ");
			traverseRightSkewed(root.right);	
			}
		}