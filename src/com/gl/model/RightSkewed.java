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
	
	public Node node, prev = null, head = null;
	
		public void rightskew(Node root) {
			if(root == null) {
				return;
			}
				rightskew(root.left);
			
			if (head == null) {
				head = root;
				root.left = null;
				prev = root;
			}
			else {
				prev.right = root;
				root.left = null;
				prev = root;
			}
				rightskew(root.right);
		}

		public void traversal(Node root) {
			if(root == null) {
				return;
			}
			System.out.print(root.key + " ");
			traversal(root.right);	
			}
		}