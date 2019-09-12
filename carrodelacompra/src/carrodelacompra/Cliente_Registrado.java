package carrodelacompra;

import java.util.ArrayList;

public class Cliente_Registrado extends Cliente {
	private String Password;
	private int FechaNacimiento;
	private static boolean resultado;
	
	
	public Cliente_Registrado(String Nombre, String Apellidos, String Correo, String Password, int FechaNacimiento) {
		super(Nombre, Apellidos, Correo);
		this.Password = Password;
		this.FechaNacimiento = FechaNacimiento;
		// TODO Auto-generated constructor stub
	}


	public static ArrayList<Cliente_Registrado> obtenerclientes() {

		array.add(new Cliente_Registrado("Edmundo", "Gascon Berenguer", "ede", "ed", 22));
		array.add(new Cliente_Registrado("Antonio", "Sarten acho", "antonio@hotmail.com", "an", 22-8-89));
		array.add(new Cliente_Registrado("Guillermo", "aco acho", "guille@hotmail.com", "gui", 22));
		array.add(new Cliente_Registrado("Oscar", "San Bartolome", "oscar@hotmail.com", "osc", 22));

		return array;

	}
	
	

	// Validar usuario ya registrado con Correo y Password
	public static Cliente_Registrado validarClienteRegistrado(String correo, String password) {
		Cliente_Registrado cli= null;
		setResultado(false);

		if (array.size() == 0) {
			obtenerclientes();
		}
		for (int i = 0; i < array.size(); i++) {

			if (correo.compareTo(array.get(i).getCorreo()) == 0 && password.compareTo(array.get(i).Password) == 0) {
				
				cli= array.get(i);
				System.out.println("Bienvendo "+ cli.getNombre()+"!");
				setResultado(true);
			}
		}
		return cli;

	}

	public int getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}


	public static boolean isResultado() {
		return resultado;
	}


	public static void setResultado(boolean resultado) {
		Cliente_Registrado.resultado = resultado;
	}



}
// verificar sirve para cuando el user se logea me determina si el usuario es
// cliente_usuario o es administrado
// o si no existe
/*
 * public int verificar(string usu, string contra) { if (validar(usu, contra) ==
 * 1) { return 1; } else if (usu_admin == usu && password == contra) { return 0;
 * } else { return 2; } }
 */