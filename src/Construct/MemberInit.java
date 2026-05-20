package Construct;

public class MemberInit {
    String name;
    int age;
    int grade;


    // 객체 스스로가 자신을 초기화하는 기능을 제공
     void initMember(String name, int age, int grade) {
         this.name = name;
         this.age = age;
         this.grade = grade;
     }
//     initMember(String name, ...) 코드를 보면 매개변수 이름과 멤버 변수(필드) 이름이 같다
        // 자바는 변수 스코프 상 더 가까운 스코프(지역변수, 매개변수)에 우선권을 준다
        // 이름 변수 섀도잉 이라고 한다.
        // 자바는 매개변수에 가려진 멤버 변수를 가리키기 위해 this 를 제공한다.
        // this 는 jvm 힙 메모리에 생성된 인스턴스 자신의 참조값을 가리키는 숨겨진 참조 변수이다.
        // 따라서 this.name은 가까운 매개변수 말고, 힙 영역에 올라간 현재 내 인스턴스 변수 name에
        // 값을 대입하라 는 의미이다.
}
