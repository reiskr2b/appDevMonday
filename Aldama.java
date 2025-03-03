import java.util.Scanner;

public class Aldama {
    public static void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! This is Aldama contributing to the project.");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("My current age is: " + age);
        System.out.println("Next year, I will be: " + (age + 1));

        scanner.close();
    }
}
