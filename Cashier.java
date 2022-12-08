public class Cashier extends RestStaff{

    public Cashier(String name) {
        super(name);
    }

    private boolean payment = false;
    
    public boolean getPaymentState(){
        return this.payment;
      }

    public void payment() {
		this.payment = true;
		System.out.println("The visitor paid for the meal");
	}
}
