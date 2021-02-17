package ensta;

public class BattleShip extends AbstractShip {
    public BattleShip(Direction dir){
        super('B',"Battleship",4,dir);
    }

    public BattleShip(){
        this(Direction.EAST);
    }
}