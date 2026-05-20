package pack;

import pack.a.User;



public class PackageMain3 {
    public static void main(String[] args) {
        pack.a.User user1 = new pack.a.User();
        pack.b.User user2 = new pack.b.User();
    }
    // 같은 이름의 클래스가 있다면 import는 둘 중 하나만 선택할 수 있다.
    // 프로젝트에서 더 자주 사용하는 클래스를 import한다.


    // Date객체
    // java.util.Data : 범용적인 날짜와 시간 표현용 클래스
    // java.sql.Date : 데이터베이스 시스템과 연동할 때 사용하는 날짜 클래스
}