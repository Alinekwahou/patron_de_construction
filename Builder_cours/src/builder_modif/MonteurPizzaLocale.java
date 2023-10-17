package builder_modif;

public class MonteurPizzaLocale extends MonteurPizza {
	public void monterPate()
	{ pizza.setPate("feuille macabot"); }
	public void monterSauce()
	{ pizza.setSauce("combo"); }
	public void monterGarniture() { pizza.setGarniture("escargot");
	
	}

	public Pizza getPizza() { 
		  monterPate();
		  monterSauce();
	      monterGarniture();
		return pizza; 
		}
}
