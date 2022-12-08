import java.util.Random;

public class Chev extends RestStaff{

    public Chev(String name) {
        super(name);
    }

    private String[] newNation = {"italian", "russian", "moldovan", "french"};
    
    public String[] getNationState(){
        return this.newNation;
      }

    public void setNation() {

        Random r = new Random();
        int n = r.nextInt(newNation.length);
		System.out.println("The main food is from " + newNation[n] + " cuisine");

    }



}