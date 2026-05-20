package oop.Ex;

public class SuperCar {
    String modelName;
    String owner;
    int securityLevel;

    public SuperCar(String modelName) {
        this(modelName, "미지정", 50);
        // 생성자(this())는 가장 첫 번째 위치에 있어야 한다.
        // 이를 어길시, 컴파일에러가 발생하며 실행이 안된다.
    }
    public SuperCar(String modelName, String owner) {
        this(modelName, owner, 50);
    }
    public SuperCar(String modelName, String owner, int securityLevel) {
            this.modelName = modelName;
            this.owner = owner;
            this.securityLevel = securityLevel;
        System.out.println("생성자 호출: " + this.modelName + ", " + this.owner + ", " + this.securityLevel);
    }
    void displayInfo() {
        System.out.println("모델명: " + this.modelName + "\n");
        System.out.println("소유주: " + this.owner + "\n");
        System.out.println("보안 등급: " + this.securityLevel);
    }
}
