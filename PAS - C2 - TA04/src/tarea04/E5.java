package tarea04;

public class E5 {

	public static void main(String[] args) {
		int A = 5, B = 7, C = 2, D = 9;

		System.out.println("Valores iniciales:\nA = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);

		B = A;
		C = A;
		A = D;
		D = B;

		System.out.println("Valores reasignados:\nA = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
	}

}
