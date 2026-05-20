package Class1;
// 클래스와 객체 개념은 왜 필요한지 부터 시작해서, 클래스가 어떤 방식으로 발전하면서
// 만들어졌는지 점진적으로 공부해보자


// 요구사항
// 두 명의 학생 정보를 출력하는 프로그램을 작성해야 한다. 각 학생은 이름, 나이, 성적을 가지고 있다.
// 1. 첫 번째 학생의 이름은 "홍길동", 나이는 15세, 성적은 90점이다
// 2. 두 번째 학생의 이름은 "장발장", 나이는 16세, 성적은 80점이다
// 3. 각 학생의 정보는 다음과 같은 형식으로 출력된다
//              이름: [이름] 나이: [나이]세 성적: [성적]점
// 4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해 보자


// 문제점
// 학생이 늘어날 때 마다 변수와 출력하는 코드를 추가해야 함.
// -> 배열을 사용하여 문제를 해결할 수 있음



public class ClassStart1 {
    public static void main(String[] args) {
        // 변수 사용 코드

        String stuName1 = "홍길동";
        int stuAge1 = 15;
        int stuGrade1 = 90;

        String stuName2 = "장발장";
        int stuAge2 = 16;
        int stuGrade2 = 80;

        System.out.println("이름: " + stuName1 + " 나이: " + stuAge1 + " 세 성적: " + stuGrade1 + "점");
        System.out.println("이름: " + stuName2 + " 나이: " + stuAge2 + " 세 성적: " + stuGrade2 + "점");

    }


}
