package tarea04;

public class E3 {

	public static void main(String[] args) {
		int X = 5, Y = 7;
		double N = 3.2, M = 4.7;

		System.out.println("\nValores de las variables:");
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		System.out.println("N = " + N);
		System.out.println("M = " + M);

		System.out.println("\nX + Y = " + (X + Y));
		System.out.println("X - Y = " + (X - Y));
		System.out.println("X * Y = " + (X * Y));
		System.out.println("X / Y = " + (X / Y));
		System.out.println("X % Y = " + (X % Y));

		System.out.println("\nN + M = " + (N + M));
		System.out.println("N - M = " + (N - M));
		System.out.println("N * M = " + (N * M));
		System.out.println("N / M = " + (N / M));
		System.out.println("N % M = " + (N % M));

		System.out.println("\nX + M = " + (X + M));
		System.out.println("Y / M = " + (Y / M));
		System.out.println("Y % M = " + (Y % M));

		System.out.println("\nEl doble de cada variable:");
		System.out.println("X = " + (X * 2));
		System.out.println("Y = " + (Y*2));
		System.out.println("N = " + (N*2));
		System.out.println("M = " + (M*2));
		
		System.out.println("\nLa suma de todas las variables:");
		System.out.println("X + Y + N + M = " + (X + Y + N + M));
		
		System.out.println("\nEl producto de todas las variables:");
		System.out.println("X % Y % N % M = " + (X % Y % N % M));
	}

}
