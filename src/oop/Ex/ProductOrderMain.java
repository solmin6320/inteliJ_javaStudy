package oop.Ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] productOrder = {
          new ProductOrder("두부", 2000, 2),
          new ProductOrder("김치", 5000, 1),
                new ProductOrder("콜라", 1500, 2)
        };
        int Max = 0;
        for (ProductOrder i: productOrder) {
            System.out.println("상품: " + i.ProductName + " 가격: " + i.price + " 수량: " + i.Ordercount);
            Max += i.price * i.Ordercount;
        }
        System.out.println("총 결제: " + Max);

        }
    }

