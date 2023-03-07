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
        TraversalEmotes warthog = new TraversalEmotes(0, false, false, false, false, 0, "Warthog", "Warthog");
        warthog.ballOut();
        FortniteBattlePass boogieDown = new Emotes(0, false, false, false, false, 0, "Boogie Down");
        ((Emotes) boogieDown).dance();
    }
}
