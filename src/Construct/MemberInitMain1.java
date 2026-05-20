package Construct;

public class MemberInitMain1 {
    // 1단계: 절차지향적 데이터 주입
    public static void main(String[] args) {
        MemberInit mbr1 = new MemberInit();
        mbr1.name = "user1";
        mbr1.age = 15;
        mbr1.grade = 90;

        MemberInit mbr2 = new MemberInit();
        mbr2.name = "user2";
        mbr2.age = 16;
        mbr2.grade = 80;

        MemberInit[] mbrs = {mbr1, mbr2};

        for (MemberInit mbr : mbrs) {
            System.out.println("이름: " + mbr.name + " 나이: " + mbr.age + " 성적: " + mbr.grade);

        }
    }
}

// 치명적인 한계점
// 1. 코드 중복: 객체를 만들 때마다 5줄씩 반복된다. 만약 회원이 100명이면 400줄의 중복 코드가 발생한다.
// 2. 유지보수가 취약하다. (결합도 상승): 만약 MemberInit 클래스에 연락처(phoneNumber)라는 새로운 필드가 추가되면
// 기존의 객체를 생성하고 초기화 하던 모든 소스코드를 찾아가서 수정해야 한다.
