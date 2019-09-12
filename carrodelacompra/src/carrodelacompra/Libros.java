package carrodelacompra;

public class Libros extends Productos {
	String CodigoISBN;
	String Autores;
	String Titulo;
	String Editorial;
	String Impositivo;

	public Libros(String codigo, String descripcion, int precio, int precioConIm, int PrecioTotal, String CodigoISBN,
			String Autores, String Titulo, String Editorial, String Impositivo

	) {
		super(codigo, descripcion, precio, precioConIm, PrecioTotal);
		this.CodigoISBN = CodigoISBN;
		this.Autores = Autores;
		this.Titulo = Titulo;
		this.Editorial = Editorial;
		this.Impositivo = Impositivo;
	}

}
