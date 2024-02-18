package cuentas;
/**
 * Clase principal
 */

public class Main {
	/**
	 * Método principa
	 * @param args Argumentos de la linea de comandos.
	 */

	public static void main(String[] args) {

		CCuenta cuenta1; // Declaración de la cuenta.
		double saldoActual; // Saldo actual de la cuenta.

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es " + saldoActual);

		operativa_cuenta(cuenta1, 100);
	}
	/**
	 * Opera una cuenta bancaria
	 * @param cuenta1 	El nombre de la cuenta donde se realizán las operaciones
	 * @param cantidad 	La cantidad para las operaciones
	 */

	public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}

		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}

}
