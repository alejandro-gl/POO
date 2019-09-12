package carrodelacompra;

import java.util.ArrayList;

public class FormasDeEnvio implements Imprimir {
private	String a;
	static ArrayList<FormasDeEnvio> formaEnvio = new ArrayList<FormasDeEnvio>();

	public FormasDeEnvio(String aaa,double al, String g) {
		this.a=aaa;
	}

	public static    ArrayList<FormasDeEnvio> obtenerclientessss() {

		formaEnvio.add(new FormasDeEnvio("Entrega hoy",9.99, "mismo día"));
		formaEnvio.add(new FormasDeEnvio("Envío 1 día",5, "al día siguiente"));
		formaEnvio.add(new FormasDeEnvio("Envío express ",3.45, "3 días laborables"));
		formaEnvio.add(new FormasDeEnvio("Envío estándar",0, "5 días laborables"));

		
		
		return formaEnvio;

	}

	@Override
	public void imprimo() {
		System.out.println(" \n \t*****************************************");
		System.out.println("\t Bienvenido a la sección de Alimentación");
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
