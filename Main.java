import calculator.*;
import complex.*;
import logger.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Logger logger = new ConsoleLogger();

        
        Calculator calculator = new ComplexCalculator(logger);

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Введите действительную часть первого комплексного числа:");
        double real1 = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого комплексного числа:");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);

        
        System.out.println("Введите действительную часть второго комплексного числа:");
        double real2 = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго комплексного числа:");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);

        
        scanner.close();
    }
}