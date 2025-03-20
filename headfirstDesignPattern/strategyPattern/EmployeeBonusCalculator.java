package strategyPattern;

public class EmployeeBonusCalculator implements BonusCalculator {

    double annualProfit;

    public EmployeeBonusCalculator(double annualProfit) {
        this.annualProfit = annualProfit;
    }

    @Override
    public double calculateBonus(User user) {
        return annualProfit * 0.00001 * (2 + 0.1 * user.yearOfService);
    }

}
