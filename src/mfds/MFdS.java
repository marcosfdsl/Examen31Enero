package mfds;

import java.util.*;

public class MFdS {

	static Scanner sc;

	public static void main(String[] args) {

		// VARIABLES DE MAIN
		
		ArrayList<String> arrL = new ArrayList<>();
		TreeSet<String> ts = new TreeSet<>();
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		// PROCEDIMIENTOS
		
		juan(arrL);
		marta(ts, arrL);
		introducirPrecios(ts, tm);
		imprimirPrecios(tm);

	}
	
	public static void juan(ArrayList<String> arrL) {
		
		// Juan introduce la lista desordenada y con duplicados, luego se imprime
		
		System.out.println("Hola Juan, introduce tu lista de la compra:");
		
		sc = new Scanner(System.in);

		String entrada = sc.nextLine().toLowerCase();
		String arr[] = entrada.split(", ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].toUpperCase().charAt(0) + arr[i].substring(1, arr[i].length()).toLowerCase();
			arrL.add(arr[i]);
		}
		
		System.out.println("\nListado de Juan:\n" + arrL);
		
	}
	
	public static void marta(TreeSet<String> ts, ArrayList<String> arrL) {
		
		// se imprime la lista de Marta ordenada y sin duplicados
		
		ts.addAll(arrL);

		System.out.println("\nListado de Marta:\n" + ts);
		
	}
	
	public static void introducirPrecios(TreeSet<String> ts, TreeMap<String, Integer> tm) {
		
		// Rosa introduce los precios de cada producto

		System.out.println("\nRosa pasa los artículos por su caja:");

		while (!ts.isEmpty()) {
			System.out.print(ts.first() + ": ");
			int entrada3 = sc.nextInt();
			tm.put(ts.first(), entrada3);
			ts.pollFirst();
		}
		
	}
	
	public static void imprimirPrecios(TreeMap<String, Integer> tm) {
		
		// imprimimos los productos y el total con sus respectivos precios de manera estética
		
		Iterator<String> it = tm.keySet().iterator();
		int total = 0;
		
		System.out.println("\nTICKET DE COMPRA:");

		while (it.hasNext()) {
			String prod = it.next();
			System.out.println(prod + " -> " + tm.get(prod) + "€");
			total += tm.get(prod);
		}
		
		System.out.println("TOTAL -> " + total + "€");
		
	}

}