package perscholas.polymoritance;

public class FireMonster  extends Monster{
    public FireMonster(String name){
        super(name);
        //super.name = name;
    }
    public String attack(){
        return "Attack with fire!";
    }
}
