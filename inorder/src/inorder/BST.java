package inorder;

public class BST {
	
	class Node {
		int key;
		Node leftNode, rightNode;

		public Node(int item) {
		key = item;
		leftNode = rightNode = null;
		}
		}


		Node root;


		BST() {
		root = null;
		}

		void insert(int key) {
		root = insertRec(root, key);
		}


		Node insertRec(Node root, int key) {


		if (root == null) {
		root = new Node(key);
		return root;
		}


		if (key < root.key)
		root.leftNode = insertRec(root.leftNode, key);
		else if (key > root.key)
		root.rightNode = insertRec(root.rightNode, key);


		return root;
		}

		void inorder() {
		inorderRec(root);
		}

		void inorderRec(Node root) {
		if (root != null) {
		inorderRec(root.leftNode);
		System.out.println(root.key);
		inorderRec(root.rightNode);
		}
		}

		public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder();
		}

}
