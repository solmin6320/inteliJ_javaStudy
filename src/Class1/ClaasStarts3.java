package Class1;
// 흩어져 있던 한 학생의 데이터를 하나로 모을 필요성이 생김
// 이름 뒤에 생긴 개념이 클래스이다.
public class ClaasStarts3 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "홍길동";
        stu1.age = 15;
        stu1.grade = 90;

        Student stu2 = new Student();
        stu2.name = "장발장";
        stu2.age = 16;
        stu2.grade = 80;

        System.out.println("이름: " + stu1.name + " 나이: " + stu1.age + "세 성적: " + stu1.grade + "점");
        System.out.println("이름: " + stu2.name + " 나이: " + stu2.age + "세 성적: " + stu2.grade + "점");

    }
}
// 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하고, 이 설계도가 클래스이다.
// 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스 라고 한다.
// 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 았음.

// 객체를 사용하려면 설계도인 클래스를 기반으로 객체(인스턴스)를 생성해야함
// new Student(); new는 새로 생성한다는 뜻. new Student()는 Student 클래스 정보를 기반으로 새로운 객체를
// 생성하라는 뜻. 이렇게 하면 실제 Student 객체가 메모리에 생성함
// Student 클래스는 String name, int age, int grade 멤버 변수를 가지고 있음. 이 변수를 사용하는데 필요한 메모리 공간도 함께 확보함

// 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소)를 반환함.
// new 키워드를 통해 객체가 생성되고 나만 참조값을 반환함. 앞서 선언한 변수인 Student stu1에 생성된 객체의 참조값을 보관함.
// Student stu1 변수는 이제 메모리에 존재하는 실제 Student 객체의 참조값을 가짐.
// 이 변수(stu1)를 통해 객체를 접근(참조)할 수 있음.

// Student stu1 = new Student();
// Student stu1 = 0x00ff99;
// stu1 = 0x00ff99;