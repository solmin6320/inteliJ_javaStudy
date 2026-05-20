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
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        data.volume++;
        System.out.println("현재 볼륨: " + data.volume);

        // 볼륨 증가
        data.volume++;
        System.out.println("현재 볼륨: " + data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("현재 볼륨: " + data.volume);


        // 음악 플레이어 상태
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레리어 OFF");
        }
        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

        // 음악 플레이어와 관련된 데이터는 MusicPlayerData 클래스에 존재한다
        // MusicPlayerData 클래스를 사용하도록 기존 로직을 변경하였다.
        // 프로그램 로직이 더 복잡해져서 다양한 변수들이 추가되더라도 음악 플레이어와 관련된
        // 변수들은 MusicPlayerData 객체에 속해 있으므로, 쉽게 구분할 수 있다.
    }
}
