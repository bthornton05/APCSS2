package Fortnite;

public class Emotes extends FortniteBattlePass{
private static boolean hasSong;
private static boolean fromTikTok;
private static int goodnessScale;
private static String name;
    public Emotes(int j, boolean p, boolean i, boolean q, boolean w, int e, String r) {
        super(j, p, i);
        hasSong = q;
        fromTikTok = w;
        goodnessScale = e;
        name = r;
    }
    public boolean getHasSong(){
        return hasSong;
    }
    public void setHasSong(boolean b){
        hasSong = b;
    }
    public boolean getFromTikTok(){
        return fromTikTok;
    }
    public void setFromTikTok(boolean pp){
        fromTikTok = pp;
    }
    public int getGoodnessScae(){
        return goodnessScale;
    }
    public void setGoodnessScale(int h){
        goodnessScale = h;
    }
    public String getName(){
        return name;
    }
    public void setName(String pp){
        name = pp;
    }
    public void dance(){
        System.out.println("You used " + name + ".");
    }
    public void equipToWheel(){
        System.out.println(name + " equipped to wheel");
    }
    
}
