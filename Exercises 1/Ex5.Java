public class Ex5 {
	public static void main(String[] args) {
		
		double x = 88;
		double y = 3.5;
		double z = -5.2;

		double resultadoA = x + y + z;
		System.out.println("a) " + resultadoA);

		double resultadoB = 2 * y + 3 * (x - z);
		System.out.println("b) " + resultadoB);

		double resultadoC = x / y;
		System.out.println("c) " + resultadoC);

		double resultadoD = x % y;
		System.out.println("d) " + resultadoD);

		double resultadoE = x / (y + z);
		System.out.println("e) " + resultadoE);

		double resultadoF = x * (y % z);
		System.out.println("f) " + resultadoF);

		double resultadoG = 3 * x - z - 2 * x;
		System.out.println("g) " + resultadoG);

		double resultadoH = (2 * x / 5) % y;
		System.out.println("h) " + resultadoH);

		double resultadoI = x - y - z * 2;
		System.out.println("i) " + resultadoI);
	}
}
