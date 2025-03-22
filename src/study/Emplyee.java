package study;

public class Emplyee {
    private String employeeName;
    private double basicSalary;
    private double salaryCoefficient;
    public static final double SALARY_MAX = 100000.0;

    public Emplyee(String employeeName, double basicSalary, double salaryCoefficient) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.salaryCoefficient = salaryCoefficient;
    }

    public double calculateSalary() {
        return basicSalary * salaryCoefficient;
    }

    public boolean increaseSalary(double increment) {
        double newCoefficient = salaryCoefficient + increment;
        if (calculateSalary() * (newCoefficient / salaryCoefficient) > SALARY_MAX) {
            System.out.println("Salary increase exceeds the maximum allowed salary.");
            return false;
        } else {
            salaryCoefficient = newCoefficient;
            return true;
        }
    }

    public void printInfo() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Salary Coefficient: " + salaryCoefficient);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
} 



