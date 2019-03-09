package juego;




import java.util.Scanner;
import juego.Jugadores;
public class Menu {
   
    public static boolean contador = false;
    
	
    
    public static void menu(){
	
   
	
	System.out.println("/*********************************************/\n"
		+ "/********* JUEGO DEL 7 y MEDIO ***************/\n"
		+ "/*********************************************/");
	
	
	    
    System.out.println("Modos de juego");
    System.out.println("(1)Un jugador\n (2) jugadores");
    System.out.println("Elija el modo de juego");
    Scanner teclado = new Scanner(System.in);
    int a = teclado.nextInt();
    if (a >= 3){
	 System.out.println("Error, eliga 1 o 2");
    }
    if (a == 1){
    	
   
	
    	Jugadores.Seleccion_1jugador();
    	

    	}
   
    	if (a == 2){
	
	
    	Jugadores.Seleccion_2jugadores();
	
    	}

   
    System.out.println("Tipos de Baraja");
    System.out.println("(E)Española\n (F)Francesa");
    System.out.println("Elija el tipo de baraja");
    
    Scanner baraja = new Scanner(System.in);
    String BarajaE = baraja.nextLine();
    
    char BarajaESP = BarajaE.charAt(0);
    
  
    switch (BarajaESP){
    
    
    case 'E':
	
	Baraja barajaES = new Baraja();
	barajaES.barajaE();
	

	
	
	break;
	
    case 'F':
	
	Baraja barajaFR = new Baraja();
	barajaFR.barajaF();
	
	break;
  
    
    default :
	
	System.out.println("Caracter invalido");
	
    	}
    
    if(a == 1 ){
    	
    	Jugadores.mostrar_jugador1();
    	
    	
    }
    
    else{
    	
    	Jugadores.mostrar_jugador1_2();
    }
	 
	 
	 
    }
	
	
	
}



