package juego;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Jugadores 
{


private String Alias;
private String Nombre;
private String Apellidos;

// Defino contadores para según la opción que desee el usuario haga una jugada u otra//
static int contador =0;
static int contador2 = 0;

// Defino los arrayList para luego obtener de ellos los datos de los jugadores //

static ArrayList<String> jugador = new ArrayList<String>();
static ArrayList<String> maquina = new ArrayList<String>();
static ArrayList<String> jugador2 = new ArrayList<String>();
static ArrayList<String> jugador3 = new ArrayList<String>();








	public static void Seleccion_1jugador() {   
		
	    // Nos pide los datos del jugador1 y nos genera los de la máquina y almacena ambos cada uno en un arrayList //
    
                /* JUGADOR 1 */
    
    System.out.println ("Introduzca los datos del jugador 1");
    
    
    Jugadores jugador1 = new Jugadores();
    
    
    Scanner teclado2 = new Scanner(System.in);
    System.out.println("Alias:");
    String Alias = teclado2.nextLine();
    
     jugador1.setAlias(Alias);
    
    System.out.println("Nombre:");
    String Nombre = teclado2.nextLine();
    
    jugador1.setNombre(Nombre);
    
    System.out.println("Apellidos:");
    String Apellidos = teclado2.nextLine();
    
    jugador1.setApellidos(Apellidos);
    
    jugador.add(jugador1.Alias);
    jugador.add(jugador1.Nombre);
    jugador.add(jugador1.Apellidos);
    
    
    /* JUGADOR MAQUINA */
    
    System.out.println ("Datos jugador 2 (Autogenerado)");
    
    Jugadores maquina1 = new Jugadores ();
    
    System.out.println("Alias:");
    maquina1.setAlias_maquina();
    System.out.println(maquina1.getAlias_maquina());
    
    System.out.println("Nombre:");
    maquina1.setNombre_maquina();
    System.out.println(maquina1.getNombre_maquina());
    
    System.out.println("Apellidos:");
    maquina1.setApellidos_maquina();
    System.out.println(maquina1.getApellidos_maquina());
    
    maquina.add(maquina1.getAlias_maquina());
    maquina.add(maquina1.getNombre_maquina());
    maquina.add(maquina1.getApellidos_maquina());
    
    
}
	
	
	
	
	public static void mostrar_jugador1(){
	    // El siguiente metodo nos muestra los datos del jugador1 y no manda a otro que será el que inicie la jugada //	
		
	Iterator<String> datos = jugador.iterator(); // mecanismo estándar para acceder secuencialmente a los elementos de una colección //
        System.out.println("inicio jugada jugador1");
        while(datos.hasNext()){
        	Object elemento = datos.next();
        	System.out.print(elemento + " ");
        }
        System.out.println("\n");		// ponemos "\n" despues del bucle para formatear correctamente los datos //
        contador = 1;
        
        Baraja.Inicio_jugada();
        
        
        
		}
		
	public static void mostrar_maquina(){
	    // El siguiente metodo nos muestra los datos de la maquina y nos manda a otro que será el que inicie la jugada de la misma //		
		
		Iterator<String> datos = maquina.iterator();

		System.out.println("inicio jugada maquina");
		while(datos.hasNext()){
			Object elemento = datos.next();
			System.out.print(elemento + " ");
		}
		System.out.println("\n");	
		contador2 = 3;
		Baraja.inicio_jugada_maquina();
	}
	

	


    public static void Seleccion_2jugadores() {
	
	 // Nos pide los datos del jugador1 y los del jugador2 y almacena ambos cada uno en un arrayList //

	/* JUGADOR 1 */
	
    System.out.println ("Introduzca los datos del jugador 1");
    
    Jugadores jugador1 = new Jugadores (); 
    
    Scanner teclado1 = new Scanner(System.in);
    System.out.println("Alias:");
    String Alias = teclado1.nextLine();
    
    jugador1.setAlias(Alias);
    
    System.out.println("Nombre:");
    String Nombre = teclado1.nextLine();
    
    jugador1.setNombre(Nombre);
    
    System.out.println("Apellidos:");
    String Apellidos = teclado1.nextLine();
    
    jugador1.setApellidos(Apellidos);
    
    

    jugador2.add(jugador1.Alias);
    jugador2.add(jugador1.Nombre);
    jugador2.add(jugador1.Apellidos);

    
    
    
    		/* JUGADOR 2*/
  
    System.out.println ("Introduzca los datos del jugador 2");
    
    
    Jugadores jugador2 = new Jugadores (); 
    
    Scanner teclado3 = new Scanner(System.in);
    System.out.println("Alias:");
    String Alias2 = teclado3.nextLine();
    
    jugador2.setAlias(Alias2);
    
    System.out.println("Nombre:");
    String Nombre2 = teclado3.nextLine();
    
    jugador2.setNombre(Nombre2);
    
    System.out.println("Apellidos:");
    String Apellidos2 = teclado3.nextLine();
    
    jugador2.setApellidos(Apellidos2);
    
    
    

    jugador3.add(jugador2.Alias);
    jugador3.add(jugador2.Nombre);
    jugador3.add(jugador2.Apellidos);


    }

	// DOS JUGADORES MOSTRAR //
    
    public static void mostrar_jugador1_2(){
	// El siguiente metodo nos muestra los datos del jugador1 y nos manda a otro que será el que inicie la jugada //
	
	Iterator<String> datos = jugador2.iterator();

	System.out.println("inicio jugada jugador1");
	while(datos.hasNext()){
		Object elemento = datos.next();
		System.out.print(elemento + " ");
	}
	
	System.out.println("\n");
	contador = 0;
	
	Baraja.Inicio_jugada();


		
		
	}

    public static void mostrar_jugador2(){
	   // El siguiente metodo nos muestra los datos del jugador2 y nos manda a otro que será el que inicie la jugada //	   

 	   Iterator<String> datos2 = jugador3.iterator();
 	   System.out.println("inicio jugada jugador2");
 	   while(datos2.hasNext()){
 		   Object elemento = datos2.next();
 		   System.out.print(elemento + " ");
 	   }
 	   System.out.println("\n");
 	   contador2 = 2;			
 	   contador = 2;
 	   
 	   Baraja.Inicio_jugada();
 	   
 	   

 	   
    }
	

      /* JUGADOR 1 y JUGADOR 2 */

/**
 * @return el alias
 */
public String getAlias() {
    return Alias;
}



/**
 * @param alias el alias a establecer
 */
public void setAlias(String alias) {
    Alias = alias;
}


/**
 * @return el nombre
 */
public String getNombre() {
    return Nombre;
}

/**
 * @param nombre el nombre a establecer
 */
public void setNombre(String nombre) {
    Nombre = nombre;
}


/**
 * @return el apellidos
 */
public String getApellidos() {
    return Apellidos;
}



/**
 * @param apellidos el apellidos a establecer
 */
public void setApellidos(String apellidos) {
    Apellidos = apellidos;
}
  
    
		/* JUGADOR MAQUINA */
  
public String getAlias_maquina() {
    return Alias;
}
public void setAlias_maquina() {
    Alias = "autogen";
}    

public String getNombre_maquina() {
    return "player2";
}

/**
 * @param nombre el nombre a establecer
 */
public void setNombre_maquina() {
    Nombre = "player2";
}

public String getApellidos_maquina() {
    return "auto generado";
}

/**
 * @param nombre el nombre a establecer
 */
public void setApellidos_maquina() {
    Nombre = "auto generado";
}



public String toString(){
	return (this.Alias);
   }
}






    
    
    
    
    
    
    
    

