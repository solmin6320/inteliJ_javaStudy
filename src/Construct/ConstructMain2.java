package Construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        // 인스턴스 생성(new) 직후, 메모리 할당과 동시에 생성자가 즉시 강제 호출하여 값을 할당함
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct member3 = new MemberConstruct("user3", 17);
        MemberConstruct[] members = {member1, member2, member3};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);

        }
    }
}
