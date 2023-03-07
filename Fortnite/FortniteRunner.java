package Fortnite;

public class FortniteRunner {
    public static void main(String[] args){
        FortniteBattlePass pp = new FortniteBattlePass(0, false, false);
        pp.needBuyBattlePass();
        Skins omegaKnight = new Style(false, 0, null, null, 0, true, false, false);
        omegaKnight.changeColor();
        Skins omega = new Skins(false, 0, null, null, 0, false, false);
        omega.changeColor();
        Emotes boogieDown = new Emotes(0, false, false, false, false, 0, "Boogie Down");
        boogieDown.ballOut();
        Emotes warthog = new TraversalEmotes(0, false, false, false, false, 0, "Warthog", "Warthog");
        warthog.ballOut();
    }
}
