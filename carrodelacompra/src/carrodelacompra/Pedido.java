package carrodelacompra;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pedido implements Imprimir {

	ArrayList<LineaPr> lineaPedido = new ArrayList<LineaPr>();
	DecimalFormat dd = new DecimalFormat("0.00");

	public void agregarProducto(int unidades, Productos producto) {
		lineaPedido.add(new LineaPr(unidades, producto));

	}

	public void imprimo() {
		double Total = 0;
		System.out.println(" \n \t*****************************************");
		System.out.println("\t Listado de Productos Seleccionados");
		System.out.println("  \t*****************************************");

		System.out.println("\n CÓDIGO" + "  " + " DESCRIPCIÓN" + "     " + "PRECIO NETO" + "  " + "CANTIDAD" + "    "
				+ "IMPUESTO" + "  " + "TOTAL");

		for (int i = 0; i < lineaPedido.size(); i++) {

			System.out
					.println(
							"  " + lineaPedido.get(i).getProductos().getCodigo() + "    "
									+ lineaPedido.get(i).getProductos().getDescripcion() + "            "
									+ lineaPedido.get(i).getProductos().getPrecio() + "€" + "         "
									+ lineaPedido.get(i).getUnidades() + "       "
									+ lineaPedido.get(i).getProductos().getPrecioConIm()
											* +lineaPedido.get(i).getUnidades()
									+ "€" + "   " + lineaPedido.get(i).getProductos().getPrecioTotal()
											* +lineaPedido.get(i).getUnidades()
									+ "€");

			Total += lineaPedido.get(i).getProductos().getPrecioTotal()*lineaPedido.get(i).getUnidades();
		
		}
		//Calculo el importe total de la compra
		System.out.println("\n \t*****************************************");
		System.out.println("\tImporte Total: "+dd.format(Total));
		System.out.println("\t*****************************************");

	}

}
