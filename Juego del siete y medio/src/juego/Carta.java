package juego;

public class Carta 
{

private String numero;
private String palo;
double valor;

    
    
    
public Carta(String numero, String palo, double valor){ 
  
    this.numero = numero;
    this.palo = palo;
    this.valor = valor;
    
}
    
    public String toString(){
	return (this.numero + " " + this.palo + " " + this.valor);
    }
    
    
    
    
    
    
}
