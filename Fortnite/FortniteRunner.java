package Fortnite;

public class FortniteRunner {
    public static void main(String[] args){
        FortniteBattlePass pp = new FortniteBattlePass(0, false, false);
        pp.needBuyBattlePass();
        Style fart = new Style(false, 0, null, null, 0, true, false, false);
        fart.needBuyBattlePass();
        FortniteBattlePass vBucks = new FortniteBattlePass(0, false, false);
        vBucks.rewardVBucks();
        Skins omega = new Skins(false, 0, null, null, 0, false, false);
        omega.changeColor();
    }
}
