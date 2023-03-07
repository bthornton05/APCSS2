package Fortnite;

public class Style extends Skins{
    private static boolean hasStyles;
    public Style(boolean m, int l, String n, String g, int j, boolean p, boolean i, boolean q) {
        super(m, l, n, g, j, p, i);
        hasStyles = q;
    }
    public boolean getHasStyles(){
        return hasStyles;
    }
    public void setHasStyles(boolean pp){
        hasStyles = pp;
    }
    public void equipStyle(){
        System.out.println("You equipped " + getName() + ".");
    }
    public void unequipStyle(){
        System.out.println("You unequipped " + getName() + ".");
    }
    
}
