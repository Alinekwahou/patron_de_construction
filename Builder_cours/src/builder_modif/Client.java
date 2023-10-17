package builder_modif;

public class Client {

	public static void main(String[] args) {
		Directeur D=new Directeur();
		D.contruirePizzaReine().print();
		
		D.contruirePizzaPiquante().print();
		
		D.contruirePizzaLocale().print();
		
		
	}

}
