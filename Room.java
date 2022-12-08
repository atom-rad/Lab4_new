
public class Room {

	Baggage baggage;
	private Visitor visitor;
	private boolean occupied;

	
	public Room() {
		this.occupied = false;
		this.visitor = null;
		this.baggage = null;
		
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	


	public Baggage getBaggage() {
		return baggage;
	}

	public void setBaggage(Baggage baggage) {
		this.baggage = baggage;
	}



	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}



	
}
	
	

