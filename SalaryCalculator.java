public class SalaryCalculator {
    public static void main(String[] args) {
        // Define an array of teacher salaries
        double[] salaries = {45000, 52000, 61000, 49000, 56000}; // Add more values as needed
        
        // Calculate the average salary
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        double average = sum / salaries.length;

        // Print the average salary
        System.out.printf("The average salary is: %.2f", average);
    }
}
