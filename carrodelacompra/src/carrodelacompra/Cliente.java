package carrodelacompra;

import java.util.ArrayList;

public class Cliente {

	private String Nombre;
	private String Apellidos;
	private String Correo;
	private String Direccion;

	public static ArrayList<Cliente_Registrado> array = new ArrayList<Cliente_Registrado>();

	public Cliente(String Nombre, String Apellidos, String Correo) {

		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Correo = Correo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

}
