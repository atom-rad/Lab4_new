import java.util.Random;

public class Visitor {

	Id id;
	Baggage b;
	boolean paymentState = false;
	private String type = "New";
	private boolean hungryState = true;
	private boolean tiredState = true;
	 
	//String orderR = "common";
	
	
	public boolean getHungryState(){
		return this.hungryState;
	}

	public boolean getTiredState() {
		return this.tiredState;
	}


	public String getType() {
		return this.type;
	}	


	public Visitor(boolean hungryState, boolean tiredState) {
		id = new Id();
		b = null;
		hungryState = true;
		tiredState = true;

		
		//Random rand = new Random();
		
		
		//int n = rand.nextInt(3);
		
		//if (n == 0) {
		//	orderR = "econom";
		//}
		//if (n == 1) {
		//	orderR = "common";
		//}
		//if (n == 2) {
		//	orderR = "luxury";
		//}
		
	}

	
}
