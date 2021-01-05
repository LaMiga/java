package main;

public class Main {
	/**
	 * Clase de testeo para pruebas y experimentos
	 * @author Miga
	 */
	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		System.out.println("Esta es la clase de testeo \n\t Miga - 2021\n");
		int[] prueba = new int[10000000];
		for (int i = 0; i < prueba.length; i++) {
			prueba[i] = (int) Math.random();
		}
		Long end = System.currentTimeMillis();
		
		Double total = Double.valueOf(end - start);
	
		System.out.println("Tiempo de ejecucion --> "+total);
	}

}
