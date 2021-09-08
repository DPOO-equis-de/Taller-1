package Procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import EstadoAplicacion.Combo;
import EstadoAplicacion.Ingrediente;
import EstadoAplicacion.ProductoMenu;

public class CargarInformacion {
	
	public static ArrayList<ProductoMenu> leerInfoArchivoProductosMenu(String rutaArchivo) throws FileNotFoundException, IOException
	{
		ArrayList<ProductoMenu> productosMenu = new ArrayList<ProductoMenu>();

		BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
		String linea = br.readLine();  
		while (linea != null) 
		{
			String[] partes = linea.split(";");
			
			ProductoMenu nuevoProducto = new ProductoMenu(partes[0], Integer.parseInt(partes[1]));  
			productosMenu.add( nuevoProducto );

			linea = br.readLine(); 
		}
		br.close();
		return productosMenu;
	}
	
	public static ArrayList<Combo> leerInfoArchivoCombos(String rutaArchivo, ArrayList<ProductoMenu> productosMenu) throws FileNotFoundException, IOException
	{
		ArrayList<Combo> combos = new ArrayList<Combo>();
		BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
		String linea = br.readLine();   
	
		while (linea != null) 
		{
			String[] partes = linea.split(";");
			double porcentaje = Double.parseDouble( partes[1].substring(0, partes[1].length()-1)); 

			Combo nuevoCombo = new Combo(partes[0], porcentaje);   

			for (int i = 2; i < partes.length; i++)
			{
				nuevoCombo.agregarItemACombo(partes[i]);    
			}

			combos.add( nuevoCombo );

			linea = br.readLine(); // leer la proxima linea en el archivo con un nuevo Combo 
		}
		br.close();
		return combos;
	}
	
	public static ArrayList<Ingrediente> leerInfoArchivoIngredientes(String rutaArchivo) throws FileNotFoundException, IOException
	{
		ArrayList<Ingrediente> Ingredientes = new ArrayList<Ingrediente>();

		BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
		String linea = br.readLine();  
		while (linea != null) 
		{
			String[] partes = linea.split(";");
			
			Ingrediente nuevoIngrediente = new Ingrediente(partes[0], Integer.parseInt(partes[1]));  
			Ingredientes.add(nuevoIngrediente);

			linea = br.readLine(); 
		}
		br.close();
		return Ingredientes;
	}

}
