import java.util.Random;

public class Barman extends RestStaff{

    public Barman(String name) {
        super(name);
    }
   

	private String[] drink = {"Water", "lemon jucie", "orange juice", "green tea", "latte", "Ice coffe"};


    public void servDrink(Visitor v) {
				
		Random r = new Random();
		int d = r.nextInt(drink.length);
		
		System.out.println(v.getType()+" visitor was served by "+name+" with " + drink[d]);
	}
}
