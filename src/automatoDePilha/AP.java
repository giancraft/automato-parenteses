package automatoDePilha;

import java.util.Stack;

public class AP {
	public void reconhecedorParenteses(String entrada) {
		Stack<String> pilha = new Stack<>();
		pilha.add("Z0");
		
		char[] separador = new char[entrada.length()];
		
		for (int i = 0; i < entrada.length(); i++) {
			separador[i] = entrada.charAt(i);
			if (separador[i] == '(') {
				pilha.add("X");
			} else if (separador[i] == ')') {
				pilha.pop();
			}
		}
		
		System.out.println("A pilha ficou: ");
		for (int i = 0; i < pilha.size(); i++) {
			System.out.println(pilha.get(i));
		}
		
		System.out.println();
		
		System.out.println("O autômato: " + entrada);
		
		if (pilha.contains("X") || pilha.isEmpty())
			System.out.println("Não compatível com a linguagem");
		else
			System.out.println("É compátivel com a linguagem");
	}
}
