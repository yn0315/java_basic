package day15.party;

import day14.inherit.player.Player;

public class Main {
    public static void main(String[] args) {

        Party party = new Party(3);

        party.addPlayer(new Player("김까까"));
        party.addPlayer(new Player("박꼬꼬"));
        party.addPlayer(new Player("최꺼꺼"));

        party.kickPlayer("최꺼꺼");
        party.kickPlayer("박찬호");
        party.showPartyInfo();
    }
}
