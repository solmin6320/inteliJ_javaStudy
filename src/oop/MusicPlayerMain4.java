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
public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.off();




    }
    }
    // MusicPlayer 객체를 생설하고 필요한 기능(메서드)만 호출해서 사용했다.
    // 필요한 모든 것은 MusicPlayer 안에 들어있다.
    // -> MusicPlayer를 사용하는 입장에서는 MusicPlayer의 데이터 타입 volume, isOn 같은 데이터는
    // 전혀 사용하지 않는다
    // -> MusicPlayer를 사용하는 입장헤서는 MusicPlayer 내부에 어떤 속성(데이터)이 있는지 전혀 몰라도 된다
    // MusicPlayer를 사용하는 입장에서는 단순하게 MusicPlayer가 제공하는 기능 중에 필요한 것만 사용하면 된다


    // 캡슐화
    // MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
    // 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화 라고 한다.
