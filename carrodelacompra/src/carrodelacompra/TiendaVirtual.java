package carrodelacompra;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaVirtual {

	private String r = "R";
	private String s = "S";
	private String a = "A";
	private String i = "I";
	private String l = "L";
	private String b = "B";
	private String m = "M";

	private int entradaAccio = 0;
	private int Unidade = 0;

	private String entradaAltaNombre;
	private String entradaApellidos;
	private String entradaCorreo;
	int entradaFechNac;
	private String entradaPasw;
	Cliente_Registrado mal = new Cliente_Registrado(a, a, a, a, entradaFechNac);
	private Scanner entradaAltaUs = new Scanner(System.in);
	Scanner entradMiCuenta = new Scanner(System.in);
	private String entradaMenuCompraCliente;
	private String entradaTipoCliente;
	private Scanner tipodecliente = new Scanner(System.in);
	private Scanner menuCompraCliente = new Scanner(System.in);
	Cliente_Registrado cliente;

	private Scanner comprobarUsuarioRegistrado;
	private Scanner listProductos = new Scanner(System.in);
	private Scanner listaCateg = new Scanner(System.in);
	Scanner entradaAccione = new Scanner(System.in);
	Scanner entrada = new Scanner(System.in);

	private String v;
	private Alimentacion ad;
	private Pedido pedido = new Pedido();
	private String entraciones;

	// Desde aquí se realiza todas las acciones que dese el cliente
	public void inicia_visita_cliente() {
		cabecera_tienda();
		tipo_de_cliente(null, null, null, null);

	}

	// Muestro la cabecera del Programa
	public void cabecera_tienda() {
		System.out.println("\n\t#########################################");
		System.out.println(" \t### TIENDA   VIRTUAL   EL   ESMALLAO  ###");
		System.out.println("  \t#########################################");

	}

	// Pido por pantalla al cliente que se identifique
	public void tipo_de_cliente(String nombre, String apellidos, String correo, String password) {

		String comprobarcorreo;
		String comprobarpassword;

		System.out.println(" \n \t*****************************************");
		System.out.println("  \t(R)Usuario registrado");
		System.out.println("  \t(A)Alta de Usuario");
		System.out.println("  \t(I)Entrar como Invitado");
		System.out.println("  \t(S)Salir del programa");
		System.out.println("  \t*****************************************");
		do {

			System.out.println("  \n\tSeleccione una opcion:");
			entradaTipoCliente = tipodecliente.nextLine();

			if (entradaTipoCliente.compareToIgnoreCase(s) == 0) {
				salir_del_programa();
			}

			else if (entradaTipoCliente.compareToIgnoreCase(a) == 0) {

				altaDeUsuario();
			}

			else if (entradaTipoCliente.compareToIgnoreCase(i) == 0) {
				entrarComoInvitado();

			}

			else if (entradaTipoCliente.compareToIgnoreCase(r) == 0) {

				comprobarUsuarioRegistrado = new Scanner(System.in);
				System.out.println("Correo:");
				comprobarcorreo = comprobarUsuarioRegistrado.nextLine();

				System.out.println("Password:");
				comprobarpassword = comprobarUsuarioRegistrado.nextLine();

				// Comprobamos que los datos del array coincidan con los
				// introducidos por teclado

				Cliente_Registrado cli = Cliente_Registrado.validarClienteRegistrado(comprobarcorreo,
						comprobarpassword);

				if (cli != null) {

					menuCompraCliente();
				} else if (cli == null) {

					System.out.println("Ha introducido mal usuario o contraseña");

					System.out.println("  \n\tSeleccione una opcion:");
					entradaTipoCliente = tipodecliente.nextLine();

				}

			}

		} while (entradaTipoCliente.compareToIgnoreCase(s) != 0

		&& entradaTipoCliente.compareToIgnoreCase(r) != 0

		&& entradaTipoCliente.compareToIgnoreCase(a) != 0

		&& entradaTipoCliente.compareToIgnoreCase(i) != 0);

	}

	// Cliente ha decidido registrarse
	public ArrayList<Cliente_Registrado> altaDeUsuario() {

		System.out.println("  \n\tIntroduca su Nombre:");
		entradaAltaNombre = entradaAltaUs.nextLine();

		System.out.println("  \n\tIntroduca sus Apellidos:");
		entradaApellidos = entradaAltaUs.nextLine();

		System.out.println("  \n\tIntroduca sus correo:");
		entradaCorreo = entradaAltaUs.nextLine();

		System.out.println("  \n\tIntroduca una contraseña:");
		entradaPasw = entradaAltaUs.nextLine();

		System.out.println("  \n\tIntroduca tu fecha de nacimiento:");
		entradaFechNac = entradaAltaUs.nextInt();
		menuCompraCliente();

		Cliente.array.add(new Cliente_Registrado(entradaAltaNombre, entradaApellidos, entradaCorreo, entradaPasw,
				entradaFechNac));

		return Cliente.array;
	}

	// Menu inicial, damos tres opciones al cliente
	public void menuCompraCliente() {
		String si = "Si";
		String no = "No";

		System.out.println(" \n \t*****************************************");
		System.out.println("  \t(M)Mi Cuenta");
		System.out.println("  \t(L)Listar productos seleccionados");
		System.out.println("  \t(B)Buscar productos");
		System.out.println("  \t(S)Salir del programa");
		System.out.println("  \t*****************************************");

		System.out.println("  \n\tSeleccione una opcion:");
		entradaMenuCompraCliente = menuCompraCliente.nextLine();

		if (entradaMenuCompraCliente.compareToIgnoreCase(l) == 0) {
			listarProductosSeleccionados();

		} else if (entradaMenuCompraCliente.compareToIgnoreCase(b) == 0) {
			listaCategorias();

		} else if (entradaMenuCompraCliente.compareToIgnoreCase(s) == 0) {
			salir_del_programa();
		}

		if (entradaMenuCompraCliente.compareToIgnoreCase(m) == 0 && entradaTipoCliente.compareToIgnoreCase(i) == 1) {
			miCuenta();

		} else if (entradaMenuCompraCliente.compareToIgnoreCase(m) == 0
				&& entradaTipoCliente.compareToIgnoreCase(i) == 0) {
			System.out.println("Todavía no se ha registrado!¿Desea hacerlo ahora? ");

			System.out.println("  \n\tSeleccione una opcion Si/No:");
			entradaMenuCompraCliente = menuCompraCliente.nextLine();

		}

		else if (entradaMenuCompraCliente.compareToIgnoreCase(m) == 0) {
			miCuenta();
		}

		if (entradaMenuCompraCliente.compareToIgnoreCase(si) == 0) {
			tipo_de_cliente(null, null, null, null);

		} else if (entradaMenuCompraCliente.compareToIgnoreCase(no) == 0) {
			menuCompraCliente();
		}

	}

	// Cliente agrega la línea del pedido según artículo desee
	public void agregarLineaPed() {

		String a = "A";
		String v = "V";
		String entradaAcciones;
		String si = "SI";
		String no = "NO";

		System.out.println("\n\t Acciones:");
		System.out.println("\t (A) Agregar producto al carrito");
		System.out.println("\t (B) Volver al menú anterior");

		System.out.println("  \n\tSeleccione una opcion:");
		entradaAcciones = listaCateg.nextLine();

		if (entradaAcciones.compareToIgnoreCase(a) == 0) {

			do {
				System.out.println("  \n\tIndique la línea del pedido:");
				entradaAccio = entradaAccione.nextInt();

				System.out.println("  \n\tUnidades:");
				Unidade = entradaAccione.nextInt();
				pedido.agregarProducto(Unidade, Productos.arrayProducto.get(entradaAccio - 1));

				System.out.println("\n\t¿Desea agregar otro producto? Si/No");
				entraciones = entrada.nextLine();

				if (entraciones.compareToIgnoreCase(no) == 0) {
					listaCategorias();

				}

				else if (entradaAcciones.compareToIgnoreCase(v) == 0) {

					listaCategorias();

				}

			} while (entraciones.compareToIgnoreCase(si) == 0);
		}

	}

	// Cliente Pide que le mostremos los productos añadidos al carrito
	public void listarProductosSeleccionados() {
		pedido.imprimo();
		accionesListadoProductosSeleccionados();
	}

	public void accionesListadoProductosSeleccionados() {

		String entradaAcProductSeleccionados;
		String f = "F";
		String r = "R";
		String v = "V";

		System.out.println("\n\t Acciones:");
		System.out.println("\t (F) Formalizar compra");
		System.out.println("\t (R) Vaciar los productos seleccionados");
		System.out.println("\t (V) Volver al menú anterior");

		System.out.println("  \n\tSeleccione una opcion:");
		entradaAcProductSeleccionados = listaCateg.nextLine();

		if (entradaAcProductSeleccionados.compareToIgnoreCase(f) == 0) {
			formalizarCompra();
		} else if (entradaAcProductSeleccionados.compareToIgnoreCase(r) == 0) {
			pedido.lineaPedido.clear();
			menuCompraCliente();
		}

		else if (entradaAcProductSeleccionados.compareToIgnoreCase(v) == 0) {
			menuCompraCliente();
		}
	}

	public void formalizarCompra() {
		String v = "V";
		String entradaFormalizarCompra;

		System.out.println("\n\t*****************************************");
		System.out.println("  \tA continuación le guiaremos en el proceso de compra del pedido,");
		System.out.println("  \tpara ello pasará por los siguientes pasos:");
		System.out.println("  \tPaso1. Opción de envío");
		System.out.println("  \tPaso2. Dirección de envío");
		System.out.println("  \tPaso3. Forma de pago");
		System.out.println("  \tPaso4. Resumen y confirmación");
		System.out.println("  \t*****************************************");

		System.out.println("\n\tPaso1. Opciónes de envío");
		System.out.println("\n\t(1)Entrega hoy (9,99 €, mismo día)");
		System.out.println("  \t(2)Envío 1 día (5 €, compra hoy y recibe mañana)");
		System.out.println("  \t(3)Envío expres (3 €, tres días laborabes)");
		System.out.println("  \t(4)Envío estándar (Gratis,5 días laborables)");
		System.out.println("  \t(V)Volver al menú anterior");

		System.out.println("  \n\tSeleccione una opcion:");
		entradaFormalizarCompra = listProductos.nextLine();

		if (entradaFormalizarCompra.compareToIgnoreCase(v) == 0) {
			listarProductosSeleccionados();

		} else {

		}

	}

	// El cliente elige Categorías de la tienda, ALIMENTACION, DISCOS Y LIBROS
	public void listaCategorias() {

		String entradaListCateg;

		String a = "A";

		String l = "L";

		String d = "D";

		String v = "V";

		System.out.println(" \n\t*****************************************");

		System.out.println(" \tListado de categorías");

		System.out.println("  \t*****************************************");

		System.out.println("  \t(A)Seccion de alimentacion");

		System.out.println("  \t(L)Seccion de libros");

		System.out.println("  \t(D)Seccion de discos");

		System.out.println("  \t(V)Volver al menu anterior");

		System.out.println("  \t*****************************************");

		do {
			System.out.println("  \n\tSeleccione una opcion:");
			entradaListCateg = listaCateg.nextLine();

			if (entradaListCateg.compareToIgnoreCase(a) == 0) {
				ad = new Alimentacion(null, null, 0, 0, 0, null, 0);
				ad.imprimo();
				agregarLineaPed();
			} else if (entradaListCateg.compareToIgnoreCase(l) == 0) {

			} else if (entradaListCateg.compareToIgnoreCase(v) == 0) {
				menuCompraCliente();
			} else if (entradaListCateg.compareToIgnoreCase(d) == 0) {

			}
		} while (entradaListCateg.compareToIgnoreCase(l) != 0 && entradaListCateg.compareToIgnoreCase(a) != 0
				&& entradaListCateg.compareToIgnoreCase(v) != 0 && entradaListCateg.compareToIgnoreCase(d) != 0);

	}

	public void miCuenta() {
		String entradaMiCuenta;
		String p = "P";
		String f = "F";
		String d = "D";
		String v = "V";

		System.out.println("  \t*****************************************");
		System.out.println("  \t(P)Pedidos reaizados");
		System.out.println("  \t(F)Formas de Pago realizadas");
		System.out.println("  \t(D)Direcciones de envío");
		System.out.println("  \t(B)Volver al menu anterior");
		System.out.println("  \t*****************************************");

		System.out.println("  \n\tSeleccione una opcion:");
		entradaMiCuenta = entradMiCuenta.nextLine();

		if (entradaMiCuenta.compareToIgnoreCase(p) == 0) {

		} else if (entradaMiCuenta.compareToIgnoreCase(f) == 0) {

		} else if (entradaMiCuenta.compareToIgnoreCase(d) == 0) {

		} else if (entradaMiCuenta.compareToIgnoreCase(v) == 0) {
			menuCompraCliente();

		}

	}

	// El cliente elige si seguir con la compra, vaciar la cesta o volver atras
	public void listarProductos() {
		v = " V ";
		String borrar = "B";
		String formalizarCompra = "F";
		String entradaProductos;

		System.out.println(" \n \t*****************************************");
		System.out.println("  \t(F)Formalizar compra");
		System.out.println("  \t(B)Vaciar los productos seleccionados");
		System.out.println("  \t(V)Volver al menu anterior");
		System.out.println("  \t*****************************************");

		System.out.println("  \n\tSeleccione una opcion:");
		entradaProductos = listProductos.nextLine();

		if (entradaProductos.compareToIgnoreCase(v) == 0) {
			menuCompraCliente();
		} else if (entradaProductos.compareToIgnoreCase(borrar) == 0) {

		} else if (entradaProductos.compareToIgnoreCase(formalizarCompra) == 0) {

		}

	}

	// El cliente ha decidido salir del programa
	public void salir_del_programa() {
		System.exit(0);
	}

	// El cliente ha decidido entrar como invitado
	public void entrarComoInvitado() {
		System.out.println("Bienvenido!\n Usted ha iniciado sesión como invitado");
		menuCompraCliente();

	}

	public String getEntraciones() {
		return entraciones;
	}

	public void setEntraciones(String entraciones) {
		this.entraciones = entraciones;
	}

}
