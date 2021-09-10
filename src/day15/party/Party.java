package day15.party;

import day14.inherit.player.Player;

public class Party {

    Player[] players;
    int count; //현재 파티참여 인원수

    //못찾았다는 플래그
    public static final int NOT_FOUND = -1;

    //num: 파티인원수
    public Party(int num) {
        players = new Player[num];
        System.out.println(num +"인 파티가 생성되었습니다.");

    }

    //파티원 추가기능
    public void addPlayer(Player p){
        //파티인원수 초과검증
        if(count>= players.length) {
            System.out.printf("풀파티입니다. %s님 즐\n", p.nickName);
            return;
        }
        players[count++] = p;
        System.out.printf("%s님 파티 참여 완료!\n", p.nickName);

    }

    //파티원 전체정보 보기
    public void showPartyInfo() {
        System.out.printf("****현재 파티원 정보(%d명 참여중)*****\n", count);
        for (int i = 0; i < count; i++) {
            players[i].info();
        }
    }

    //파티원 추방 기능
    public void kickPlayer(String targetNick) {
        int idx = findIndexByNick(targetNick);
        if(idx!= NOT_FOUND) {
            for (int i = 0; i < count-1; i++) {
                players[i] = players[i+1];
            }
            players[--count] = null;
            System.out.printf("%s님을 추방했습니다\n", targetNick);
        }else {
            System.out.println("파티원을 찾을 수 없습니다.");
        }
    }

    //닉네임으로 해당 플레이어의 인덱스번호를 찾는 메서드
    private int findIndexByNick(String nick){
        for (int i = 0; i < count; i++) {
            if(nick.equals(players[i].nickName)) {
                return i;
            }
        }
        return NOT_FOUND;
    }

}
