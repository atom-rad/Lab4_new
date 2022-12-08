public class Waiter extends RestStaff{

    public Waiter(String name) {
        super(name);
    }
    
    private boolean service = false;
    
    public boolean getServiceState(){
        return this.service;
      }

    public void service() {
		this.service = true;
		System.out.println("The table was served by waiter "+ name);
	}

}
