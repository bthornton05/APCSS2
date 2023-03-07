package Fortnite;

public class TraversalEmotes extends Emotes{
    private static String prop;
    public TraversalEmotes(int j, boolean p, boolean i, boolean q, boolean w, int e, String r, String t) {
        super(j, p, i, q, w, e, r);
        prop = t;
    }
    public String getProp(){
        return prop;
    }
    public void setProp(String pp){
        prop = pp;
    }
    public void traverse(){
        System.out.println("You begin to " + getName() + ".");
    }
    public void ballOut(){
        System.out.println("You begin to spin and convulse rapidly as you watch youself ball out to " + getName() + ".");
    }
}
