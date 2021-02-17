package ensta;

public class Submarine extends AbstractShip {
    public Submarine(Direction dir){
        super('S',"Submarine",3,dir);
    }

    public Submarine(){
        this(Direction.EAST);
    }
}