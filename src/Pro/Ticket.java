package Pro;

public class Ticket {
    String visitoName;
    int age;
    int passType;
    boolean hasCard;

    public Ticket (String visitoName, int age, int passType, boolean hasCard) {
        this.visitoName = visitoName;
        this.age = age;
        this.passType = passType;
        this.hasCard = hasCard;
    }
    public Ticket (String visitoName, int age, int passType) {
        this(visitoName, age, passType, false );
    }
    public int getBasePrice() {
        if (passType == 1) {
            return 50000;
        } else if (passType == 2) {
            return 30000;
        } else {
            return 0;
        }

    }
    public int getDiscount() {
        if (hasCard && passType == 1) {
            return getBasePrice() *50 /100;
        } else if (hasCard && passType == 2) {
                return getBasePrice() *20 / 100;
        } else if(age >= 65 || age <= 12) {
            return 10000;
        } else {
            return 0;
        }

    }
    public int getFinalPrice() {
        return getBasePrice() - getDiscount();
    }
    public String getAgeGroup() {
        if (age >= 19) {
            return "성인";
        } else {
            return "미성년자";
        }
    }
}

