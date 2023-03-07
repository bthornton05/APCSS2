package Fortnite;
import java.util.Scanner;
public class FortniteBattlePass {
private static int tier;
private static boolean hasPremiumBattlePass;
private static int vBucks;

public FortniteBattlePass(int j, boolean p, int b){
    tier = j;
    hasPremiumBattlePass = p;
    vBucks = b;
}
public int getTier(){
return tier;
}
public void setTier(int t){
    tier = t;
}
public boolean getHasPremiumBattlePass(){
    return hasPremiumBattlePass;
}
public void setHasPremiumBattlePass(boolean h){
    hasPremiumBattlePass = h;
}
public int getVBucks(){
    return vBucks;
}
public void setVBucks(int v){
    vBucks = v;
}
public void buyBattlePass(){
    vBucks -= 1000;
    hasPremiumBattlePass = true;
    System.out.println("You now have the premium battle pass.");
}
public void buyTiers(){
Scanner pp = new Scanner(System.in);
int tiers;
int cost;
System.out.println("How many tiers would you like to purchase?");
tiers = pp.nextInt();
cost = tiers*150;
if (cost <= vBucks){
    vBucks -= cost;
    tier += tiers;
    System.out.println("You successfully purhcased " + tiers + " tiers.");
    pp.close();
}
else{
    System.out.println("You don't have the fundage.");
    pp.close();
}
}
}
