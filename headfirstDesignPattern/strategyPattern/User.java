package strategyPattern;

public class User {

    String name;
    String userId;
    String role;
    int yearOfService;
    double basicMonthlySalary;
    BonusCalculator bonusCaculator;

    public User(String name, String userId, String role, int yearOfService, double basicMonthlySalary,
            BonusCalculator bonusCaculator) {
        this.name = name;
        this.userId = userId;
        this.role = role;
        this.yearOfService = yearOfService;
        this.basicMonthlySalary = basicMonthlySalary;
        this.bonusCaculator = bonusCaculator;
    }

    double getAnnualSalary() {
        return 12 * basicMonthlySalary + this.bonusCaculator.calculateBonus(this);
    };
}
