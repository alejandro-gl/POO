package carrodelacompra;

public class Discos extends Productos {
String Artista;
String Genero;
String Impositivo;

	
	public Discos(String codigo, String descripcion, int precio, int precioConIm, int PrecioTotal, String Genero,String Artista, String Impositivo
) {
		super(codigo, descripcion, precio, precioConIm, PrecioTotal);
	this.Artista= Artista;
	this.Genero= Genero;
	this.Impositivo= Impositivo;

	}
	
	

		
	//producto.add("Jamón Ibérico");
	
	


}
