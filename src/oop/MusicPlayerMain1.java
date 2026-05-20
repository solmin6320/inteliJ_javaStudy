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
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("현재 볼륨: " + volume);

        // 볼륨 증가
        volume++;
        System.out.println("현재 볼륨: " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("현재 볼륨: " + volume);


        // 음악 플레이어 상태
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레리어 OFF");
        }
        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

        // 순서대로 프로그램이 작동하도록 단순하게 작성하였으며,
        // 이 코드를 점진적으로 변경하여 객체 지향에 대해 알아보자
    }
}
