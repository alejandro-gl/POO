package carrodelacompra;

import java.util.ArrayList;

public class FormasDeEnvio implements Imprimir {
private	String a;
	static ArrayList<FormasDeEnvio> formaEnvio = new ArrayList<FormasDeEnvio>();

	public FormasDeEnvio(String aaa,double al, String g) {
		this.a=aaa;
	}

	public static    ArrayList<FormasDeEnvio> obtenerclientessss() {

		formaEnvio.add(new FormasDeEnvio("Entrega hoy",9.99, "mismo d�a"));
		formaEnvio.add(new FormasDeEnvio("Env�o 1 d�a",5, "al d�a siguiente"));
		formaEnvio.add(new FormasDeEnvio("Env�o express ",3.45, "3 d�as laborables"));
		formaEnvio.add(new FormasDeEnvio("Env�o est�ndar",0, "5 d�as laborables"));

		
		
		return formaEnvio;

	}

	@Override
	public void imprimo() {
		System.out.println(" \n \t*****************************************");
		System.out.println("\t Bienvenido a la secci�n de Alimentaci�n");
		System.out.println("  \t*****************************************");

obtenerclientessss();
		for (int i = 0; i < formaEnvio.size(); i++) {
			formaEnvio.get(i);
			System.out.println("  " +formaEnvio.get(i).get(0));
					
			//System.out.println("  " +formaEnvio.get(i).getA());

		
		}		
	}

	private FormasDeEnvio get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getA() {
		return a;
	}

	public void setA(String aaa) {
		this.a = aaa;
	}

	
}
