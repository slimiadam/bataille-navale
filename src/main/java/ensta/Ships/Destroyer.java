package ensta;

public class Destroyer extends AbstractShip {
    public Destroyer(Direction dir){
        super('D',"Destroyer",2,dir);
    }

    public Destroyer(){
        this(Direction.EAST);
    }
}