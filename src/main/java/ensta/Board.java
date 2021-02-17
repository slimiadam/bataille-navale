package ensta;

public class Board {
    protected String _name;
    protected char [][] _ships;
    protected boolean [][] _strikes;

    public Board(String name, int size) {
        this._name = name;
        if (size<0){
            size=-size;
        }
        if (size>100){
            size=size%100;
        }
        this._ships = new char [size][size];
        this._strikes = new boolean [size][size];
    }

    public Board(String name) {
        this(name,10);
    }

    public String nStrings(int n, String str){
        String res = "";
        for (int i=0; i<n; i++){
            res += str;
        }
        return res;
    }

    public void print() {
        int a=65;
        String Ships="Ships";
        String Strikes="Strikes";
        int size=this._ships.length;

        System.out.println(Ships + nStrings((size + 1)*2 + 4 - Ships.length()," ") + Strikes);
        System.out.print(nStrings(2," "));
        for (int i=0; i<size; i++){
            System.out.print(" " + (char) (a+i));
        }
        System.out.print(nStrings(6," "));
        for (int i=0; i<size; i++){
            System.out.print(" " + (char) (a+i));
        }
        System.out.println();
        for (int i=0; i<size; i++){
            if(i<9){
                System.out.println((i+1) + " " + nStrings(size," .") + nStrings(4," ") + (i+1) + " " + nStrings(size," ."));
            }
            else{
                System.out.println((i+1) + nStrings(size," .") + nStrings(4," ") + (i+1) + nStrings(size," ."));
            }
            
        }
    }
}