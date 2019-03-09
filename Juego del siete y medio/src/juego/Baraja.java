package juego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;




public class Baraja 

{
   
   /* He conseguido que compare el jugador 1 con el jugador 2 pero no el jugador1 con la máquina 
	comento el código por si quiere probarlo, tambien comento el arrayList definido como atributo
	
    static ArrayList<Double> compara = new ArrayList<Double>(); */
    
    static ArrayList<Carta> baraja = new ArrayList<Carta>();
    static ArrayList<Double> maquina = new ArrayList<Double>();
    
    

    public void barajaE(){ /* Baraja Española */
	
	// El siguiente metodo realiza la baraja española con su numero, palo y valor //
    
    
	  String numero[] = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", 
	         "Siete", "Ocho", "Nueve", "Sota", "Caballo", "Rey" };
	      String palos[] = { "Copas", "Oros", "Bastos", "Espadas" };
	      
	      
		  
	     double valor = 1;
		  
		  
			  if(valor > 7){
				  
				  valor = 1;
			  }
			  
			  for(int i = 0; i<numero.length-5; i++){
			      
			      /* Bucle anidado ej: 4 veces AS, 4 veces dos, etc.*/
				  
				  for(int z = 0; z<palos.length; z++){
					  
					  
					  baraja.add(new Carta(numero[i], palos[z],valor));
				  	
				  }
			    	
				 
			    	
				    valor++;  		 
		  }
		  
			   double valor2 = 0.5;
			  for(int i = 7; i<numero.length; i++){
				  
				  for(int z = 0; z<palos.length; z++){
					  
					  baraja.add(new Carta(numero[i], palos[z],valor2));
					  			  
					  
				  }
			    	
				   	
		  }
			  
	            
		    
    }
    public void barajaF() { /* Baraja francesa*/
	
	// El siguiente metodo realiza la baraja francesa con su numero, palo y valor //
    
    	String numero[] = { "A", "Dos", "Tres", "Cuatro", "Cinco", "Seis", 
         "Siete", "Ocho", "Nueve", "Diez", "J", "Q", "K" };
    	String palos[] = { "Corazones", "Rombos", "Picas", "Treboles" };
      
       
    	double valor = 1;
	  
	  
	  if(valor > 7){
		  
		  valor = 1;
	  }
	  
	  for(int i = 0; i<numero.length-6; i++){
	      
	      /* Bucle anidado ej: 4 veces AS, 4 veces dos, etc.*/
		  
		  for(int z = 0; z<palos.length; z++){
			  
			  
			  baraja.add(new Carta(numero[i], palos[z],valor));
		    	
		    	
		  }
	    	
	    	
		    valor++;  		 
  }
    
	
    	
	  
	  double valor2 = 0.5;
	  for(int i = 7; i<numero.length; i++){
		  
		  for(int z = 0; z<palos.length; z++){
			  
			  baraja.add(new Carta(numero[i], palos[z],valor2));
		  }
	    	
	  }
    
     
}
		    public static void Inicio_jugada(){
			
		/* El siguiente metodo realiza las jugada para el jugador 1 y 2 dependiendo de lo que el usuario introzca */
		    	 
		    	Collections.shuffle(baraja);
		    	
		    	  double total2 = 0.0;
		    	/*
		    	 * Declaramos array list de la mano del jugador 
		    	 * con un for recorremos el array list de la baraja 
		    	 * añadimos las cartas del array baraja al array mano
		    	 * lo mostramos y volvemos a preguntar
		    	 * 
		    	 */
		    	
		     ArrayList<Carta> mano = new ArrayList<Carta>();
		   
		     boolean contador = true;
		    	  
		    
		    	 
		    		for(int i = 0; i<baraja.size(); i++){	
		    			
		    			 if(contador == true){
		    			
		    			

			    		mano.add(baraja.get(i));
			    		System.out.println(baraja.get(i));
			    		
			    		System.out.println("desea una nueva carta");
			    		
			    		Scanner teclado1 = new Scanner(System.in);
			    		String respuesta = teclado1.nextLine();
			    	    
    	    
			    		if(respuesta == "" ){
			    			
			    			System.out.println("error");
			    		}
			    		else{
			    			
			    			
			    			 char siOno = respuesta.charAt(0);
					    	    
			    	    	 switch (siOno){
						    	    
			    	    	 case 'S':
						    	    	
					contador = true;
						    	    	
					break;
								    	  
						    	    
						    		
					case 'N':
					contador = false;
					Iterator<Carta> datos = mano.iterator();
						    	    	
					ArrayList<Double> suma = new ArrayList<Double>();
						    	    	
						    	    	
					Iterator<Double> total = suma.iterator();
						    	    	
					if(Jugadores.contador <=1){
						  System.out.println("el jugador1 se planta con las siguientes cartas" );
						    	    		  
						    	    	}
						    	    	
					else{
						    	    		
						 System.out.println("el jugador2 se planta con las siguientes cartas" );
						    	    	}
						    	    	
						    	      
				    	        
					while(datos.hasNext()){
						    
					    Object elemento = datos.next();
					    System.out.print(elemento + "\n");
						    	        	
						}
						    	        
					for(int j= 0; j<mano.size(); j++){
						    	        	
					suma.add(mano.get(j).valor);
						    	        	
						}
						    	        
						    	      
					for(int z= 0; z<suma.size(); z++){
						    	    	   
					total2 += suma.get(z);
						    	    	   
						}
					
					/* compara.add(total2);  */       
					    	       
						    	        
		// falta comparar el total del jugador1 con el total del otro jugador y/o máquina //
						    	       
					System.out.println("la suma es " + total2);				
						    	       
					    		
					break;
						    	    	
					default:
					    
					try{
						    	    		
					System.out.println("eleccion erronea");
					contador = true;
						    	    
						   }
					catch(Exception e){
						    	    			
					System.out.println("error");
						   }
						    	    			
						    	    		
						    	    		
						    	    }
						    	    	
			    			}
				    			
				    			 
				    	}
				    		
			    			    
			    }
		    		
		    		
		    		  
			    	   
		    	if(Jugadores.contador <1){
		    		Jugadores.mostrar_jugador2();
		    		
		    		
		    	}
		    	
		    	if(Jugadores.contador2 <1 ){
		    	Jugadores.mostrar_maquina();
		    	}
		    	
		    	
		    	else{
		    	System.out.println("");
		    	}
		    	
		    	/* He conseguido que compare el jugador 1 con el jugador 2 pero no el jugador1 con la máquina 
		    	 * comento el código por si quiere probarlo, tambien comento el arrayList arriba definido como 
		    	 *atributo
		    	 
		    	 System.out.println(compara.get(0));
	    			
	    		if(compara.get(0)>compara.get(1) && compara.get(0)<=7.5){
	    			
	    			
	    			System.out.println("el jugador 1 gana con la siguiente puntuacion" +  " " + compara.get(0));					// hacer bien el texto //
	    		}
	    		
	    		
	    		if(compara.get(1)>compara.get(0) && compara.get(0)<=7.5){
	    			
	    			System.out.println("el jugador 2 gana con la siguiente puntuacion" +  " " + compara.get(1));	
	    		}
	    		
	    		
	    		if(compara.get(0)<compara.get(1) && compara.get(0)>7.5){
	    			

	    			System.out.println("el jugador 1 gana con la siguiente puntuacion" +  " " + compara.get(0));
	    			
	    			
	    		}
	    		
	    		
	    		if(compara.get(1)<compara.get(0) && compara.get(1)>7.5){
	    			
	    			System.out.println("el jugador 2 gana con la siguiente puntuacion" +  " " + compara.get(1));
	    		}
	    		
	    		
	    	 */
	     
	    	
		    	       }

	    	
		    public static void inicio_jugada_maquina(){
			
			/* El siguiente metodo realiza la jugada de la máquina y la muestra por pantalla */
			
			Collections.shuffle(baraja);
			
			
			    
			    maquina.add(baraja.get(0).valor);
			    maquina.add(baraja.get(1).valor);
			    maquina.add(baraja.get(2).valor);
			
			    
			
			
			System.out.println("La máquina se planta con los siguientes valores:");
			System.out.println(maquina.get(0));
			System.out.println(maquina.get(1));
			System.out.println(maquina.get(2));
			
			double total3 = 0.0;
			
			 for(int z= 0; z<maquina.size(); z++){
			    	   
			     total3 += maquina.get(z);
			     
			 }
			     System.out.println("la suma es " + total3);	
			
			       
		    }

        
    }
    

    
    

   
    
    
    
    
    
    

