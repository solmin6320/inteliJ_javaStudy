package Pro;

public class TicketMain {
    public static void main(String[] args) {
        Ticket[] ticket = {
                new Ticket("키리토", 19,1,true),
                new Ticket("아스나", 18,2),
                new Ticket("시논", 12,1),
                new Ticket("리파", 22,2,true),
                new Ticket("클라인", 65,1),
        };
        int max = 0;
        int count = 0;
        int maxcount = 0;
        String a = "";
        for (Ticket i: ticket) {
            System.out.println("[" + i.visitoName + "]" + " 분류: " + i.getAgeGroup() + " 기본 요금: " + i.getBasePrice() + " 할인 금액: " + i.getDiscount() + " 최종결제: " + i.getFinalPrice());
            max += i.getFinalPrice();
            if (i.getAgeGroup().equals("미성년자")) {
                count++;
            }
            if (i.getDiscount() > maxcount) {
                maxcount = i.getDiscount();
                    a = i.visitoName;
            }
        }
        System.out.println("총 티켓 판매 수익: " + max);
        System.out.println("미성년자 방문객 수: " + count);
        System.out.println("가장 할인을 많이 받은 사람: " + a);

    }
}
