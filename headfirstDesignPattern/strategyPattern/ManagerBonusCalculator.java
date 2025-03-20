package strategyPattern;

public class ManagerBonusCalculator implements BonusCalculator {

    double annualProfit;

    public ManagerBonusCalculator(double annualProfit) {
        this.annualProfit = annualProfit;
    }

    @Override
    public double calculateBonus(User user) {
        return annualProfit * 0.0001 * (10 + 0.5 * user.yearOfService);
    }

}
