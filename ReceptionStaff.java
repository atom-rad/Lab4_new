
public class ReceptionStaff extends HotelStaff {

	public ReceptionStaff(String name) {
		super(name);
	}
	
	public void assignRoom(Room r, Visitor v) {
		r.setOccupied(true);
		r.setVisitor(v);
		System.out.println("The room was assigned to visitor with id "+ v.id.getId());
	}
}
