
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

    public double eatHeartily(double payment) {
        double mealPrice = 4.30;
        if (payment < mealPrice) {
            return payment;
        }
        this.money += mealPrice;
        this.heartyMeals += 1;
        return payment - mealPrice;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
