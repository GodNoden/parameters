package main;

public class Parametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short x = 233;
		int y = 500;
		long z = 2000000;
		System.out.println(shortReturn(parametrosShort(x)));
		System.out.println("\n");
		System.out.println(intReturn(parametrosInt(y)));
		System.out.println("\n");
		System.out.println(longReturn(parametrosLong(z)));
	}

	public static byte[] parametrosShort(short var) {// 1. Implementar un método en java que reciba un parámetro de tipo
														// short
		byte[] arreglo = new byte[2];
		arreglo[0] = (byte) (var & 0xff); // 2. Dicho método obtenga los bytes de mayor y menor orden del short y los
											// coloque en un arreglo de bytes.
		arreglo[1] = (byte) ((var >> 8) & 0xff);
		System.out.println(arreglo[0]);
		System.out.println(arreglo[1]);
		return arreglo;
	}

	public static short shortReturn(byte[] var) { // 3. Implementar un método que reciba un arreglo bytes

		return (short) (((var[1] & 0xFF) << 8) | (var[0] & 0xFF)); // 4. El método anterior una de nuevo los bits tal
																	// cual estaban en el short original y devuelva una
																	// variable de tipo short

	}

	public static byte[] parametrosInt(int var) { // 5. Hacer lo mismo pero con una variable de tipo int.
		byte[] arreglo = new byte[4];
		arreglo[0] = (byte) (var >> 24);
		arreglo[1] = (byte) ((var >> 16));
		arreglo[2] = (byte) ((var >> 8));
		arreglo[3] = (byte) ((var));
		System.out.println(arreglo[0]);
		System.out.println(arreglo[1]);
		System.out.println(arreglo[2]);
		System.out.println(arreglo[3]);
		return arreglo;
	}

	public static int intReturn(byte[] var) {

		return ((var[0] & 0xFF) << 24) | ((var[1] & 0xFF) << 16) | ((var[2] & 0xFF) << 8) | ((var[3] & 0xFF) << 0);

	}

	public static byte[] parametrosLong(long var) {
		byte[] arreglo = new byte[8];
		arreglo[0] = (byte) (var >> 56);
		arreglo[1] = (byte) (var >> 48);
		arreglo[2] = (byte) (var >> 40);
		arreglo[3] = (byte) (var >> 32);
		arreglo[4] = (byte) (var >> 24);
		arreglo[5] = (byte) (var >> 16);
		arreglo[6] = (byte) (var >> 8);
		arreglo[7] = (byte) (var);
		System.out.println(arreglo[0]);
		System.out.println(arreglo[1]);
		System.out.println(arreglo[2]);
		System.out.println(arreglo[3]);
		System.out.println(arreglo[4]);
		System.out.println(arreglo[5]);
		System.out.println(arreglo[6]);
		System.out.println(arreglo[7]);
		return arreglo;

	}

	public static long longReturn(byte[] var) { // Implementas los métodos para empaquetar y desempaquetar variables de
												// tipo long.

		return ((long) var[0] << 56) | ((long) var[1] & 0xff) << 48 | ((long) var[2] & 0xff) << 40
				| ((long) var[3] & 0xff) << 32 | ((long) var[4] & 0xff) << 24 | ((long) var[5] & 0xff) << 16
				| ((long) var[6] & 0xff) << 8 | ((long) var[7] & 0xff);

	}

}
