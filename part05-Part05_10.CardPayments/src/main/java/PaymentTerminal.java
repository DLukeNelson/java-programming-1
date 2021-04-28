
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double mealPrice = 2.50;
        if (payment < mealPrice) {
            return payment;
        }
        this.money += mealPrice;
        this.affordableMeals += 1;
        return payment - mealPrice;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        double mealPrice = 2.50;
        boolean successful = card.takeMoney(mealPrice);
        if (successful) {
            this.affordableMeals += 1;
        }
        return successful;
    }

    public double eatHeartily(double payment) {
        double mealPrice = 4.30;
        if (payment < mealPrice) {
            return payment;
        }
        this.money += mealPrice;
        this.heartyMeals += 1;
        return payment - mealPrice;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        double mealPrice = 4.30;
        boolean successful = card.takeMoney(mealPrice);
        if (successful) {
            this.heartyMeals += 1;
        }
        return successful;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
