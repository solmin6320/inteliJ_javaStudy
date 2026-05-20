package Construct;

public class MemberInitMain2 {
    // 2단계: 객체 내부 메서드를 통한 초기화 (캡슐화의 시작)
    public static void main(String[] args) {
        MemberInit mbr1 = new MemberInit();
            mbr1.initMember("user1", 15, 90);


        MemberInit mbr2 = new MemberInit();
        mbr2.initMember("user2", 16, 80);


        MemberInit[] mbrs = {mbr1, mbr2};

        for (MemberInit mbr : mbrs) {
            System.out.println("이름: " + mbr.name + " 나이: " + mbr.age + " 성적: " + mbr.grade);

        }
    }
}

    // 메서드 초기화 방식의 문제점
    // 결국 new로 객체를 만든 후 초기화 메서드를 호출하여 객체의 값을 초기화 해야 한다.
    // 따라서 개발자가 new를 사용하여 객체를 만든 후 실수로 initMember() 호출을 누락할 수 있다는
    // 불안정성을 가진다.
