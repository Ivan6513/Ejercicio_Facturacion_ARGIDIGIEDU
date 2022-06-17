import java.util.Scanner;

public class Facturacion {

	public static void main(String[] args) {
		
		System.out.println("*************************************\n"
		                 + "******* Bienvenido ARGDIGIEDU *******\n"
				 + "*************************************\n");

		Scanner teclado = new Scanner(System.in);
		
		// Ingreso por teclado
		System.out.print("Ingrese prefijo de factura: ");
		String prefijoFactura = teclado.nextLine();

		teclado.close();
		
		// Inicializacion de variables
		int numeroAleatorio = 0;
		final int LIMITE = 20;
		String caracterNumeral = "#";

		int numeroCaracteresIngresados = prefijoFactura.length();
		int diferencia = LIMITE - numeroCaracteresIngresados;
		
		if (diferencia > 0) {
			
			// Establecemos un rango, este es un numero aleatorio que va desde 0 hasta el
			// valor obtenido de la diferencia + 1
			int rango = (int) (Math.random() * (diferencia) + 1);

			// numeroAleatorio va desde 0 hasta (10 ^ (rango) + 1)
			numeroAleatorio = (int) ((Math.random() * Math.pow(10, rango)) + 1);

			// Establecemos cuantos digitos tiene numeroAleatorio
			int digitosNumeroAleatorio = Integer.toString(numeroAleatorio).length();

			// Obtenemos el numero de repeticiones por diferencia
			// Donde repeticiones = LIMITE - numeroCaracteresIngresados - digitosNumeroAleatorio
			int repeticiones = diferencia - digitosNumeroAleatorio;

			String codigoFactura = prefijoFactura.toUpperCase() + caracterNumeral.repeat(repeticiones)
					+ numeroAleatorio;
			
			System.out.println("El numero de factura generado es: " + codigoFactura);

		} else {

			System.out.println("Excedió la cantidad de caracteres para la factura. " + "Intente nuevamente");

		}
	}

}
