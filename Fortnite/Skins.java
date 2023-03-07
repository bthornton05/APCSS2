package Fortnite;
import java.util.Scanner;
public class Skins extends FortniteBattlePass{
    private static boolean hasChallenges;
    private static int coolness;
    private static String color;
    private static String name;
    public Skins(boolean m, int l, String n, String g, int j, boolean p, boolean i) {
        super(j, p, i);
        hasChallenges = m;
        coolness = l;
        color = g;
        name = n;
    }
    public boolean getHasChaellenges(){
        return hasChallenges;
    }
    public void setHasChallenges(boolean h){
        hasChallenges = h;
    }
    public int getCoolness(){
        return coolness;
    }
    public void setCoolness(int c){
        coolness = c;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }
    public String getName(){
        return name;
    } 
    public void setName(String n){
        name = n;
    }
    public void equip(){
        Scanner pp = new Scanner(System.in);
        System.out.println("Would you like to equip " + name + " ? y/n");
        if(pp.next().equals("y")){
            System.out.println("Equipped " + name + ".");
            pp.close();
        }
        else{
            pp.close();
        }
    }
    public void changeColor(){
        System.out.println("I'm sorry sir, the season is over, you can no longer earn the Omega lights.");
    }
}
