package EstadoAplicacion;

public class Ingrediente {

	private String nombre;
	private int costoAdicional;
	
	public Ingrediente(String nombreP, int costoAdicionalP)
	{
		this.nombre = nombreP;
		this.costoAdicional = costoAdicionalP;
	}
	
	/**
	 * Permite convertir un objeto ProductoMenu a un String 
	 */
	@Override
	public String toString()
	{
		return this.nombre + "-" + this.costoAdicional;
	}
	
	public String getNombre()
	{
		return nombre;		
	}
	
	public int getCostoAdicional()
	{
		return costoAdicional;		
	}
	
}
