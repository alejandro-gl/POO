package carrodelacompra;


public class LineaPr {

private	Productos Productos;
private	int Unidades;

		

public LineaPr(int Unidades, Productos Producto){
	
this.Productos= Producto;
this.Unidades= Unidades;
}



		

		public int getUnidades() {
			return Unidades;
		}

		public void setUnidades(int unidades) {
			Unidades = unidades;
		}



		public Productos getProductos() {
			return Productos;
		}



		public void setProductos(Productos productos) {
			Productos = productos;
		}



	







}
