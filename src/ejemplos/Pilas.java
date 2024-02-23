package ejemplos;
import java.util.Stack;

public class Pilas {
	private Stack<Node> pila;
	
	public Pilas() {
		pila = new Stack<>();
		
	}
	public void push(int dato) {
		Node node = new Node(dato);
		if (!pila.isEmpty()) {
			pila.peek().right = node;
		}
	}
	public void show() {
		for(Node node : pila) {
			System.out.print(node.dato);
		}
	}
	

}
