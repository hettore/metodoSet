package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0d, 3.6));

		System.out.println(notas.toString());
		
		System.out.println();
		
		System.out.println("Exiba a posição da nota 5.0: ");
		System.out.println("Não conseguimos buscar com o get quando usamos o set");
		System.out.println("Também não conseguimos trabalhar com substituição em certa posição");
		
		System.out.println();
		
		System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5.0));
		
		System.out.println();
		
		System.out.println("Exiba a terceira nota adicionada: ");
		System.out.println("Também não conseguimos usando o Set so daria certo usando o List");
		
		System.out.println();
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println();
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores da collection Set: " + String.format("%.2f", soma));
		
		System.out.println("Exiba a média dos valores da collection Set: " + String.format("%.2f", soma/notas.size()));
		
		System.out.println();
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0.0);
		System.out.println(notas);
		
		System.out.println();
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println();
		
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		Set<Double> notas1 = new LinkedHashSet<>();
		notas1.add(7.0);
		notas1.add(8.5);
		notas1.add(9.3);
		notas1.add(5d);
		notas1.add(7d);
		notas1.add(0d);
		notas1.add(3.6);
		
		System.out.println(notas1);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas2 = new TreeSet<>(notas1);
		System.out.println(notas2);
		
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		
		System.out.println();
		
		System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
		System.out.println("Confira se o conjunto 2 está vazio: " + notas1.isEmpty());
		System.out.println("Confira se o conjunto 3 está vazio: " + notas2.isEmpty());
		System.out.println(notas);
		System.out.println(notas1);
		System.out.println(notas2);
		
		
		
		
	}

}
