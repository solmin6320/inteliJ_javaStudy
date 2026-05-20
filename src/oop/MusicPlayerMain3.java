package oop;
// 요구사항
// 1. 음악 플레이어를 켜고 끌 수 있어야 한다
// 2. 음악 플레이어의 볼륨을 증가, 감소할 수 있어야 한다.
// 3. 음악 플레이어의 상태를 확인할 수 있어야 한다,

// 시나리오
// 음악 플레이어를 시작합니다.
// 현재 볼륨: 1
// 현재 볼륨: 2
// 현재 볼륨: 3
// 음악 플레이어 ON, 볼륨: 1
// 음악 플레이어를 종료합니다.
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();


        // 코드의 중복 부분을 메서드를 사용하여 해결해보자
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
static void volumeUp(MusicPlayerData data) {
        data.volume++;
    System.out.println("현재 볼륨");
}

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("현재 볼륨: " + data.volume);
    }
static void showStatus(MusicPlayerData data) {
    System.out.println("음악 플레이어 상태 확인");
    if (data.isOn) {
        System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
    } else {
        System.out.println("음악 플레이어 OFF");
    }
    }

}
// 각각의 기능을 메서드로 만든 덕분에 각각의 기능이 "모듈화" 되었다.
// 1. 중복 제거: 중복 로직이 제거되었고, 같은 로직이 필요하면 해당 메서드를 호출하면 된다.
// 2. 변경 영향 범위: 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
// 3. 메서드 이름이 추가: 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.
// 모듈화 -> 레고블록