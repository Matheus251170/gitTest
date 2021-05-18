package POO.Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class colecoes {

	public static void main(String[] args) {
	
		
		List <Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);
		minhaLista.add(6);
		minhaLista.add(4);
		
		for(Integer lista: minhaLista)
		{
			System.out.println(lista);
		}
		
		System.out.println("\nRemovendo um elemento da lista: ");
		System.out.println();
		minhaLista.remove(0);
		
		for(Integer lista: minhaLista)
		{
			System.out.println(lista);
		}
		
		int primeiroElemnto = minhaLista.get(0);
		
		System.out.println("\nO primeiro elemento é: " + primeiroElemnto);
		System.out.println();
		
		for(int i = 0; i < minhaLista.size(); i++)
		{
			System.out.println("\nElemento: " + minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		System.out.println("\nLista depois de ordenada: ");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set <Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(6);
		meuSet.add(2);
		meuSet.add(4);
		meuSet.add(3);
		
		
		Iterator <Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext());
		{
			System.out.println(iMeuSet.next());
		}
		
		
		
	}

}
