package InteraccionUsuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import EstadoAplicacion.Restaurante;



public class Aplicaci�n {
	
	public void ejecutarAplicacion() throws IOException
	{
		Restaurante.cargarInformacionRestaurante("./data/ingredientes.txt", "./data/combos.txt", "./data/menu.txt");
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
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
					System.out.println("Saliendo de la aplicación...");
					continuar = false;
				}
				
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}

	/**
	 * Muestra al usuario el menú con las opciones para que escoja la siguiente
	 * acción que quiere ejecutar.
	 */
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Iniciar nuevo pedido");
		System.out.println("2. Agregar elemento al pedido");
		System.out.println("3. Cerrar pedido y guardar factura");
		System.out.println("4. Consultar información de un pedido dado el id");
		System.out.println("5. Salir de la aplicación\n");
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
		System.out.println("Inicio de ejecución de la aplicación");
		Aplicaci�n consola = new Aplicaci�n();
		consola.ejecutarAplicacion();
	}
	

}
