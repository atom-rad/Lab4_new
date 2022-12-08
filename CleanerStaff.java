
public class CleanerStaff extends HotelStaff {

    public CleanerStaff(String name) {
        super(name);
    }

    private String type = "TBCS";

    private boolean cleaned = false;



    public boolean isCleaned() {
        return cleaned;
    }

    public void setCleaned(boolean cleaned) {
        this.cleaned = cleaned;
        System.out.println("The room is cleaned by "+ type);
    }

}
