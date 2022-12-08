
public class BaggagePorterSt extends HotelStaff {
	

	public BaggagePorterSt(String name) {
		super(name);
	}
	
	public void moveBaggage(Room r, Baggage b) {
		r.baggage = b;
		System.out.println("The baggage was moved to a room by "+name);
	}


	
}
