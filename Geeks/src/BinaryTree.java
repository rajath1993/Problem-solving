import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		
		//Inorder traversal
//		System.out.println("Inorder:");
//		inOrder(root);
//		System.out.println(" ");
//		System.out.println("PostOrder:");
//		postOrder(root);
//		System.out.println("Preorder: ");
//		preOrder(root);
		
		preOrder(root);
		
		int height = heightOfTree(root);
		
		System.out.println("height: "+height);
	}
	
	public static void inOrder(Node root) {
//		Stack<Node> stk = new Stack<>();
//		
//		Node curr = root;
//		while(curr!=null||stk.size()>0) {
//			
//			while(curr!=null) {
//				stk.push(curr);
//				curr = curr.left;
//			}
//			
//			curr = stk.pop();
//			System.out.print(curr.key+" ");
//			curr = curr.right;
//		}
		
		/*recursive approach*/
		
		if(root!=null) {
			inOrder(root.left);
			System.out.print("recursive: ");
			System.out.println(root.key);
			inOrder(root.right);
		}
	}
	
	public static void postOrder(Node root) {
		/*1st approach*/
//		Stack<Node> stk = new Stack<>();
//		
//		Node curr = root;
//		
//		while(curr!=null||stk.size()>0) {
//			if(curr!=null) {
//				stk.push(curr);
//				curr = curr.left;
//			}
//			else {
//				Node temp = stk.peek().right;
//				if(temp == null) {
//					temp = stk.pop();
//					System.out.print(temp.key+ " ");
//					while(!stk.isEmpty() && temp == stk.peek().right) {
//						temp = stk.pop();
//						System.out.print(temp.key + " ");
//					}
//				}
//				else {
//					curr = temp;
//				}
//			}
//		}
		/*2nd approach*/
//		Stack<Node> stack = new Stack<>();
//		Set<Node> visited = new HashSet<>();
//		
//		stack.push(root);
//		while(stack.size()>0) {
//			Node curr = stack.peek();
//			if(curr.left!=null&&!visited.contains(curr.left)) {
//				stack.push(curr.left);
//				curr = curr.left;
//			}
//			else if(curr.right!=null&&!visited.contains(curr.right)) {
//				stack.push(curr.right);
//				curr = curr.right;
//			}
//			else {
//				visited.add(curr);
//				System.out.print(stack.pop().key+" ");
//			}
//		}
		/*3rd approach recursive*/
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.key);
		}
		
	}
	
	public static void preOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		
		System.out.println("Preorder");
		
//		Node curr = new Node();
//		curr = root;
		
		stack.push(root);
		while(stack.size()!=0) {
			
			Node curr = stack.pop();
			System.out.println(curr.key);
			if(curr.right!=null) {
				stack.push(curr.right);
			}
			if(curr.left!=null) {
				stack.push(curr.left);
				
			}
		}
		
        // Create an empty stack and push root to it 
//        Stack<Node> nodeStack = new Stack<Node>(); 
//        nodeStack.push(root); 
  
        /* Pop all items one by one. Do following for every popped item 
         a) print it 
         b) push its right child 
         c) push its left child 
         Note that right child is pushed first so that left is processed first */
        /*     while (nodeStack.empty() == false) { 
  
            // Pop the top item from stack and print it 
            Node mynode = nodeStack.peek(); 
            System.out.print(mynode.key + " "); 
            nodeStack.pop(); 
  
            // Push right and left children of the popped node to stack 
            if (mynode.right != null) { 
                nodeStack.push(mynode.right); 
            } 
            if (mynode.left != null) { 
                nodeStack.push(mynode.left); 
            } 
        }*/

	}
	
	public static int heightOfTree(Node root) {
		if(root==null) return 0;
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		int height = 0;
		while(!q.isEmpty()) {
			int queueSize = q.size();
			
			for(int i=0;i<queueSize;i++) {
				Node node = q.poll();
				if(node.left!=null) q.add(node.left);
				if(node.right!=null) q.add(node.right);
			}
			
			height++;
		}
		
		
		
		return height;
		
	}

}
