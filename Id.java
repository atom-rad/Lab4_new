import java.util.Random;


public class Id {

	private int upperbound = 999999999;
	private int id;
	
	public Id() {
		this.id = generate();
	}
	public int getId() {
		return this.id;
	}
	private int generate() {
		Random r = new Random();
		return r.nextInt(upperbound);
	}
}
