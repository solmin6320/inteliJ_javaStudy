package oop.Ex;

public class SuperCarMain {
    public static void main(String[] args) {
        // 자바는 사용자가 클래스에 생성자를 안 적고 객체를 만들 시 자동으로
        // 기본 생성자를 만들어서 객체를 만들도록 도와줍니다.
        //그러므로, 클래스에 생성자를 직접 적었을시엔 인수값을 직접 적어줘야 합니다.
        // 예시: SuperCar superCar = new SuperCar(); -> new 키워드로 기본 생성자를 만듬
        SuperCar superCar = new SuperCar("Huracan"); // 생성자 1
        superCar.displayInfo();
        SuperCar superCar1 = new SuperCar("Aventador", "김형준"); // 생성자 2
        superCar1.displayInfo();
        SuperCar superCar2 = new SuperCar("Revuelto", "성일정보고", 99); // 생성자 3
        System.out.println("모델명: " + superCar2.modelName + ", " + "소유주: " + superCar2.owner + ", " + "보안 등급: " + superCar2.securityLevel);



        }

    }
