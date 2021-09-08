package InteraccionUsuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import EstadoAplicacion.Restaurante;



public class Aplicaci髇 {
	
	public void ejecutarAplicacion() throws IOException
	{
		Restaurante.cargarInformacionRestaurante("./data/ingredientes.txt", "./data/combos.txt", "./data/menu.txt");
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opci贸n"));
				if (opcion_seleccionada == 1)
					System.out.println("1");
				else if (opcion_seleccionada == 2)
					System.out.println("2");
				else if (opcion_seleccionada == 3)
					System.out.println("3");
				else if (opcion_seleccionada == 4)
					System.out.println("4");
				else if (opcion_seleccionada == 5)
				{
					System.out.println("Saliendo de la aplicaci贸n...");
					continuar = false;
				}
				
				else
				{
					System.out.println("Por favor seleccione una opci贸n v谩lida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los n煤meros de las opciones.");
			}
		}
	}

	/**
	 * Muestra al usuario el men煤 con las opciones para que escoja la siguiente
	 * acci贸n que quiere ejecutar.
	 */
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicaci贸n\n");
		System.out.println("1. Iniciar nuevo pedido");
		System.out.println("2. Agregar elemento al pedido");
		System.out.println("3. Cerrar pedido y guardar factura");
		System.out.println("4. Consultar informaci贸n de un pedido dado el id");
		System.out.println("5. Salir de la aplicaci贸n\n");
	}
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Inicio de ejecuci贸n de la aplicaci贸n");
		Aplicaci髇 consola = new Aplicaci髇();
		consola.ejecutarAplicacion();
	}
	

}
