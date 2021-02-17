package ensta;

public class AircraftCarrier extends AbstractShip {
    public AircraftCarrier(Direction dir){
        super('C',"Aircraft-Carrier",5,dir);
    }

    public AircraftCarrier(){
        this(Direction.EAST);
    }
}