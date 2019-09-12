package carrodelacompra;

import java.util.ArrayList;

/**
 * @author Edmundo Gascón
 * 
 */

public class Productos {
	private String codigo;
	private String descripcion;
	private double precio;
	private double precioConIm;
	private double PrecioTotal;
	private int  iva = 21;
	
	public static ArrayList<Productos> arrayProducto = new ArrayList<Productos>();

	public Productos(String codigo, String descripcion, double precio, float precioConIm2, float PrecioTotal) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.precioConIm = Iva(precio);
		this.PrecioTotal = Iva(precio) + PrecioTotal;
	}

	public double sumaImporteTotal(float precioConIm2, float PrecioTotal) {
		return precioConIm2 + PrecioTotal;

	}

	public double Iva(double precio) {

		return precio * iva / 100;

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getPrecioConIm() {
		return precioConIm;
	}

	public void setPrecioConIm(int precioConIm) {
		this.precioConIm = precioConIm;
	}

	public double getPrecioTotal() {
		return PrecioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		PrecioTotal = precioTotal;
	}

	public void imprimo() {

	}

}