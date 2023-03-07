package Fortnite;
public class FortniteBattlePass {
private static int tier;
private static boolean hasPremiumBattlePass;
private static boolean isVBucks;

public FortniteBattlePass(int j, boolean p, boolean i){
    tier = j;
    hasPremiumBattlePass = p;
    isVBucks = i;
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
public boolean getIsVBucks(){
    return isVBucks;
}
public void setIsVBucks(boolean pp){
    isVBucks = pp;
}
public void needBuyBattlePass(){
    if (hasPremiumBattlePass == true){
        System.out.println("This tier requires the premium Battle Pass.");
    }
    else{
        hasPremiumBattlePass = false;
        System.out.println("This tier does not require the premium Battle Pass.");
    }
}
public void rewardVBucks(){
if (isVBucks == true){
    System.out.println("This tier rewards 100 VBucks.");
}
else{
    System.out.println("This tier does not reward VBucks");
}
}
}
