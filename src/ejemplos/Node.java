package ejemplos;

public class Node {
	int dato;
	Node right;
	
	Node(int dato){
		this.dato = dato;
	}
	
	public void Add(int dato) {
		Node node = this;
		while (node.right != null) {	
		}
		node.right = new Node(dato);
	}
	public void Show() {
		Node tmp = this;
		while (tmp != null) {
			System.out.print(tmp.dato);
		}
		
	}

}
