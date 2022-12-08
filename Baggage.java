import java.util.Random;

public class Baggage {

	
	private String[] type = {"suitcase", "bag", "backpack"};
	private String bType;

	private void BagType() {
				
		Random r = new Random();
		int t = r.nextInt(type.length);
		bType = type[t];
	}

	public String getbType() {
		return bType;
	}

	static boolean marked = false;
	static boolean serviced = false;
	
	public static void markIt() {
		marked = true;
	}
	
	public static void unmarkIt() {
		marked = false;
	}

	public static void service() {
		serviced = true;
	}
	

}
