package pack;
// 외부에 있는 클래스를 미리 선언하여 가져옴
import pack.a.User;

public class PackageMain2 {
    // 다른 패키지에 있다고 해서 매번 전체 경로를 적는 것은 코드 가독성을 심각하게 떨어뜨린다.
    // 또한 라이브러리의 있는 모든 클래스의 경로를 알고 있기는 불가능하다.

    public static void main(String[] args) {
    Data data = new Data();
    User user = new User();
    }
}


// 코드 첫 줄에 package를 선언하고, 그 다음 줄 부터 import를 사용할 수 있다
// 특정 패키지의 모든 클래스를 한 번에 가져오고 싶다면 와일드카드(*)을 사용하여
// import pack.a.*; 형태로 작성할 수 있다.
// import java.util.*;

// import pack.a.*; 가정 a패키지 안에 100개의 클래스가 존재한다.
// import pack.a.User;
// 자바에 import 구분은 컴파일러에게 클래스의 위치를 알려주는 단순한 '이정표'의 역할만 한다.
// C/C++의 #include 처럼 소스코드를 통째로 복사해오는 개념이 아니기 때문에 실행 시점 성능 및
// 메모리에는 전혀 관계가 없다
// 단, 컴파일러가 해당 폴더 내와 파일들을 확인해야 하므로 컴파일 속도가 아주 미세하게 영향을 받을 뿐이다.

// import package.*; 을 선언 했다고 해서 하위 패키지인 pack.a.User 까지 자동으로 import 되지 않는다
// pack과 pack.a는 이름만 비슷할 뿐 JVM 관점에서는 완전히 독립된 별개의 패키지이다.