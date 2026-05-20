package pack;


public class PackageMain {
    public static void main(String[] args) {
        // 1. 같은 패키지 위치의 클래스 호출
        Data data = new Data();

        // 2. 다른 패키지 위치의 클래스 호출 -> 전체 경로 명시
        pack.a.User USER = new pack.a.User();
    }
}
