package Pro;

public class Order {
    String shopName;
    int foodPrice;
    int distance;
    boolean isPremium;

    public Order(String shopName, int foodPrice, int distance, boolean isPremium) {
            this.shopName = shopName;
            this.foodPrice = foodPrice;
            this.distance = distance;
            this.isPremium = isPremium;
    }
    public Order(String shopName, int foodPrice, int distance) {
            this(shopName,foodPrice,distance,false);
    }
    public int getDeliveryFee() {
        if (distance < 3) {
            return 2000;
        } else if (distance >= 3) {
            return 3000;
        } else  {
            return 0;
        }
    }
public int getDiscount() {
        if(isPremium == true && foodPrice >= 20000) {
            return getDeliveryFee();
        } else if (isPremium == true && foodPrice < 20000) {
            return 1000;
        } else {
            return 0;
        }
}
public int getFinalPrice() {
        return foodPrice + getDeliveryFee() - getDiscount();
}
public String getReviewEvent() {
        if (foodPrice >= 30000) {
            return "치즈볼";
        } else {
            return "없음";
        }
}
}
