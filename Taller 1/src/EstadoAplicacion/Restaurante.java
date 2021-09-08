package EstadoAplicacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Procesamiento.CargarInformacion;

public class Restaurante {
	
	private ArrayList<ProductoMenu> cargarMenu(String rutaArchivo)
	{
		ArrayList<ProductoMenu> productosMenu = new ArrayList<ProductoMenu>();
		try
		{
			productosMenu = CargarInformacion.leerInfoArchivoProductosMenu(rutaArchivo);
			System.out.println("OK Se cargó el archivo " + rutaArchivo + " con información de los Productos Menu.");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaArchivo + " no se encontró.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaArchivo);
			System.out.println(e.getMessage());
		}

		return productosMenu;
	}

	private ArrayList<Combo> cargarCombos(String rutaArchivo, ArrayList<ProductoMenu> productosMenu)
	{
		ArrayList<Combo> combos = new ArrayList<Combo>();
		try
		{
			combos = CargarInformacion.leerInfoArchivoCombos(rutaArchivo, productosMenu);
			System.out.println("OK Se cargó el archivo " + rutaArchivo + " con información de los Combos.");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaArchivo + " no se encontró.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaArchivo);
			System.out.println(e.getMessage());
		}

		return combos;
	}
	
	private ArrayList<Ingrediente> cargarIngredientes(String rutaArchivo)
	{
		ArrayList<Ingrediente> Ingredientes = new ArrayList<Ingrediente>();
		try
		{
			Ingredientes = CargarInformacion.leerInfoArchivoIngredientes(rutaArchivo);
			System.out.println("OK Se cargó el archivo " + rutaArchivo + " con información de los Productos Menu.");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaArchivo + " no se encontró.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaArchivo);
			System.out.println(e.getMessage());
		}

		return Ingredientes;
	}
	
	public static void cargarInformacionRestaurante(String archivoIngredientes, String archivoCombos, String archivoProductoMenu) throws IOException {
		Restaurante consola = new Restaurante();
		
		ArrayList<ProductoMenu> productosMenu = consola.cargarMenu("./data/menu.txt");  // el parametro es la ruta del archivo menu.txt dentro del proyecto Eclipse
		for (ProductoMenu prodMenu : productosMenu)
			System.out.println(prodMenu);

		ArrayList<Combo> combos = consola.cargarCombos("./data/combos.txt", productosMenu);  // parametros: ruta del archivo combos.txt y lista de productos menu disponibles
		for (Combo combo : combos)
			System.out.println(combo);
		
		ArrayList<Ingrediente> Ingredientes = consola.cargarIngredientes("./data/ingredientes.txt");  // el parametro es la ruta del archivo menu.txt dentro del proyecto Eclipse
		for (Ingrediente ing : Ingredientes)
			System.out.println(ing);
	
	}
	
	public static void iniciarPedido(String nombreCliente, String direccionCliente) {
	
		
	}
}
