package ejemplos;
import java.util.*;
public class Colas {
	private Queue<Node> cola; //crear una cola
	//constructor
	public Colas() {
		//inicializar la cola
		cola = new LinkedList<>();
		
	}
	public void addCola(int dato) {
		Node node = new Node(dato);
		if(!cola.isEmpty()) {
			cola.peek().right = node; //une el nodo anterior ocn el siguiente
		}
		cola.add(node);
	}
	public void Show() {
		for (Node node : cola) {
			System.out.println(node.dato);
		}
	}
}
