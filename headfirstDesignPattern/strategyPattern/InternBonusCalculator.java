package strategyPattern;

public class InternBonusCalculator implements BonusCalculator {

    double annualProfit;

    public InternBonusCalculator(double annualProfit) {
        this.annualProfit = annualProfit;
    }

    @Override
    public double calculateBonus(User user) {
        return 0;
    }

}
