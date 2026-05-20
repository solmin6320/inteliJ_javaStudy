package Construct;

// 언어 차원에서 강제하여 시스템의 결함을 막아주는 방어벽이 바로 생성자 이다.
// 생성자의 가장 큰 역할은 초기화를 필수로 진행하게 하는 것이다.
public class MemberConstruct {
    String name;
    int age;
    int grade;

    public MemberConstruct(String name) {
        this(name, 15, 0);
    }

    // 생성자 선언: 클래스명과 완전히 동일하며, 반환 타입(void 조차도)이 없다.
    // 장점: 핵심 초기화 로직이 단 한 곳에서만 관리되므로, 코드의 가독성이 높아져
    // 필드가 늘어나도 유지보수가 매우 용이하다.
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    // this() 호출의 절대 규칙
    // -> this()는 반드시 생성자 코드의 첫 번째 줄에만 작성해야 한다.
    // 지키지 않을 시 컴파일 에러가 발생
    MemberConstruct(String name, int age) { // 생성자 체이닝
        this(name, age, 0);

    }
    // 생성자가 가지는 절대적인 가치: 컴파일 타임 제약 (무결성 보장)
    // 1. 필수값 입력 보장
    // 2. 매개변수 없이 객체 생성시 컴파일 에러 발생
    // 3. 컴파일 시점에 원천 차단하여 프로그램의 안정성을 극대화 시켜줌


    // 기본 생성자
    // 클래스 내에 생성자가 단 하나도 없을 때 컴파일러가 소스코드(.java)를 바이트코드(.class)로
    // 변환할 때 내용이 완전히 비어있는 기본 샐성자를 자동으로 삽입해준다.
    // 생성자가 하나라도 선언되어 있으면 컴파일러는 개발자의 특수한 의도가 있다고 판단하여
    // 기본 생성자를 절대로 자동 추가해주지 않는다.
}
