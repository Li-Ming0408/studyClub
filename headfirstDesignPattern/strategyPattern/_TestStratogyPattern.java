package strategyPattern;

public class _TestStratogyPattern {

    public static void main(String[] args) {

        final double annualProfit = 100000000;

        BonusCalculator managerBonusCalculator = new ManagerBonusCalculator(annualProfit);
        BonusCalculator employeeBonusCalculator = new EmployeeBonusCalculator(annualProfit);
        BonusCalculator internBonusCalculator = new InternBonusCalculator(annualProfit);

        User alice = new User("Alice", "M0001", "Manager", 10, 100000, managerBonusCalculator);
        User bob = new User("Bob", "E0001", "Employee", 10, 50000, employeeBonusCalculator);
        User chris = new User("Chris", "E0002", "Employee", 5, 30000, employeeBonusCalculator);
        User david = new User("David", "I0002", "Intern", 1, 2000, internBonusCalculator);

        User[] users = { alice, bob, chris, david };

        for (User user : users) {
            System.out.println(user.name + "'s salary is " + user.getAnnualSalary());
        }

    }
}
