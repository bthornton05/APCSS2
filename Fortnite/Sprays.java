package Fortnite;

public class Sprays extends FortniteBattlePass{
    public Sprays(int j, boolean p, int b, String c, String n) {
        super(j, p, b);
        color = c;
        name = n;
    }
    private static String color;
    private static String name;
    public void Spray(){
        System.out.println("You used " + name + ".");
    }
    public void completeSprayChallenge(){
        System.out.println("Challenge completed. 10,000 battle pass xp has been awarded.");
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }
}
