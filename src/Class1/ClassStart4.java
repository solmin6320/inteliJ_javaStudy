package Class1;
// 클래스와 객체 덕분에 학생 데이터를 구조적으로 이해하기 쉽게 변경할 수 있음
// 마치 실제 학생이 있고, 그 안에 각 학생의 정보가 있는것 같아 사람이 이해하기 편리함
// 이제부터는 각각의 학생별로 객체를 생성하고, 해당 객체에 학생의 데이터를 관리하면 됨.
// 이전에 작성한 코드에서 아쉬운 부분이 있다면 학생 정보를 출력하는 부분임
// 새로운 학생이 추가될 때 마다 출력하는 부분도 함께 추가해야 함.
// 배열을 사용하면 특정 타입을 연속한 데이터 구조로 묶어서 편리하게 관리할 수 있음
// Student 클래스를 사용한 변수들도 Student 타입이기 때문에 학생도 배열을 사용해서 하나로
// 데이터 구조로 묶어서 관리할 수 있음.
public class ClassStart4 {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();

        students[0].name = "홍길동";
        students[0].age = 15;
        students[0].grade = 90;
        students[1].name = "장발장";
        students[1].age = 16;
        students[1].grade = 80;

        for (int i = 0; i< students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + "세 성적: " + students[i].grade + "점");
        }
        System.out.println("==========================");
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + "세 성적: " + s.grade + "점");
        }
    }
}
