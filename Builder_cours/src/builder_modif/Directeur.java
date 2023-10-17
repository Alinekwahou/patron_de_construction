package builder_modif;

public class Directeur {
	
  public Pizza contruirePizzaPiquante() {
	  MonteurPizza pizzaPiquante=new MonteurPizzaPiquante();
	
      return pizzaPiquante.getPizza();
  }
  public Pizza contruirePizzaReine() {
	  MonteurPizza pizzaReine=new MonteurPizzaReine();
	
      return pizzaReine.getPizza();
  }
  public Pizza contruirePizzaLocale() {
	  MonteurPizza piz=new MonteurPizzaLocale();
	
      return piz.getPizza();
  }

}
