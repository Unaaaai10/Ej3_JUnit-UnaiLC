package Ej3;

public class multiplosDeUnNumDe1hastaM {
	
	public static int leerN() {
		int N = 0;
		while (N <= 0) {
			System.out.println("Inserte un número para N");
			N = Console.readInt();
		}
		return N;
	}
	
	public static int leerM() {
		int M = 0;
		while (M <= 0) {
			System.out.println("Inserte un número para M");
			M = Console.readInt();
		}
		return M;
	}
	
	public static void imprimirMultiplos(int N, int M) {
		for (int i = 1; i <= M; i++) {
			if (i % N == 0) {
				System.out.println(i);
			}
		}
	}

	public void main(String[] args) {
		int N = leerN();
		int M = leerM();
		while (N > M) {
			System.out.println("Error, N es mayor que M");
			N = leerN();
			M = leerM();
		}
		imprimirMultiplos(N, M);
	}
}