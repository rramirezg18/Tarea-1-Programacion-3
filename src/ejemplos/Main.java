package ejemplos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        int valor = scanner.nextInt();
        Node first = new Node(valor);

        while (true) {
            System.out.println("Ingrese el siguiente valor o ingrese -1 para terminar ");
            valor = scanner.nextInt();
            if (valor == -1) {
                break;
            }
            first.Add(valor);  
        }

        first.Show(); 
	}

}
