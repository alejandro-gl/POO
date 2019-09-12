package carrodelacompra;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Alimentacion extends Productos implements Imprimir {
	private String FechaCaducidad;
	private Integer Impositivo = 21;
	private Productos aux;

	int Unidades;
	DecimalFormat df = new DecimalFormat("0.00");

	public Alimentacion(String codigo, String descripcion, int precio, float precioConIm, float PrecioTotal,
			String FechaCaducidad, int Impositivo) {
		super(codigo, descripcion, precio, precioConIm, PrecioTotal);
		this.FechaCaducidad = FechaCaducidad;
		this.Impositivo = Impositivo;
	}

	public static ArrayList<Productos> obtenerProductosAlimentacion() {

		arrayProducto.add(new Alimentacion("RF45", "Dorada", 433, 0, 433, "r", 3));
		arrayProducto.add(new Alimentacion("RF34", "Filete", 150, 0, 150, "r", 3));
		arrayProducto.add(new Alimentacion("RF34", "Filete", 150, 0, 150, "r", 3));
		arrayProducto.add(new Alimentacion("RF34", "Filete", 150, 0, 150, "r", 3));
		arrayProducto.add(new Alimentacion("RF34", "Filete", 150, 0, 150, "r", 3));

		return arrayProducto;

	}

	@Override
	public void imprimo() {

		super.imprimo();
		System.out.println(" \n \t*****************************************");
		System.out.println("\t Bienvenido a la sección de Alimentación");
		System.out.println("  \t*****************************************");

		System.out.println(
				"\n CÓDIGO" + "  " + " DESCRIPCIÓN" + "        " + "PRECIO NETO" + "  " + "IMPUESTO" + "  " + "TOTAL");

		if (arrayProducto.size() == 0) {
			obtenerProductosAlimentacion();
		}
		for (int i = 0; i < arrayProducto.size(); i++) {
			setAux(arrayProducto.get(i));
			System.out.print((i + 1) + " ");
			System.out.println("  " + getAux().getCodigo() + "    " + getAux().getDescripcion() + "               "
					+ df.format(getAux().getPrecio()) + "€" + "  " + " " + df.format(getAux().getPrecioConIm()) + "€"
					+ "  " + df.format(getAux().getPrecioTotal()) + "€");
		

		
		}

	}

	public String getFechaCaducidad() {
		return FechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		FechaCaducidad = fechaCaducidad;
	}

	public float getImpositivo() {
		return Impositivo;
	}

	public void setImpositivo(int impositivo) {
		Impositivo = impositivo;
	}

	public Productos getAux() {
		return aux;
	}

	public void setAux(Productos aux) {
		this.aux = aux;
	}

}
