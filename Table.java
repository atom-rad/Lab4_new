public class Table {
    
    private Visitor visitor;
    private boolean occupied;

    public Table(){
        this.visitor = null;
        this.occupied = false;
      }

    public Visitor getVisitor(){
        return this.visitor;
    }

    public boolean getTableState(){
        return this.occupied;
    }

    public void occupy(Visitor visitor){
        this.visitor = visitor;
        this.occupied = true;
        System.out.println("A table was occupied by the visitor with id " + visitor.id.getId());
      }

}
