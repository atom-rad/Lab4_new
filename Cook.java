import java.util.Random;

public class Cook extends RestStaff{

    public Cook(String name) {
        super(name);
    }

	private String[] food = {"Steak", "Mamaliga", "Soup", "Pizza", "Borsch", "Ice cream"};


    public void servFood(Visitor v) {
		
		Random r = new Random();
		int f = r.nextInt(food.length);
		
		System.out.println(v.getType()+" visitor was served by "+name+" with " + food[f]);
	}
}