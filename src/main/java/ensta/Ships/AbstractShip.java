package ensta;

public abstract class AbstractShip {
    protected char _label;
    protected String _name;
    protected int _size;
    protected Direction _dir;

    public AbstractShip(char lab, String name, int size, Direction dir){
        this._label = lab;
        this._name = name;
        this._size = size;
        this._dir = dir;
    }

    public char getLabel(){
        return _label;
    }

    public String getName(){
        return _name;
    }

    public int getSize(){
        return _size;
    }

    public Direction getDir(){
        return _dir;
    }

    public void setDir(Direction dir){
        this._dir = dir;
    }


}