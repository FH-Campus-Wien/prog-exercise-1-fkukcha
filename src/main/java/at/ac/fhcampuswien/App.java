/**
 * Author: Ferdaws Kukcha
 * Title: Programming-1-Exercises
 */

package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    int rev = 0;

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901\n" +
                           "         __\n" +
                           " _(\\    |@@|\n" +
                           "(__/\\__ \\--/ __\n" +
                           "   \\___|----|  |   __\n" +
                           "       \\ }{ /\\ )_ / _\\\n" +
                           "       /\\__/\\ \\__O (__\n" +
                           "      (--/\\--)    \\__/\n" +
                           "      _)(  )(_\n" +
                           "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int a = 'Z';
        int b = 0xface;
        int c = 012;
        int d = (int) 80L;
        int e = (int) 44e-1f;
        int f = (int) 5.5f;
        int g = (int) 8.88e1;
        int h = (int) 99.9;

        int sum = a + b + c + d + e + f + g + h;

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        //input your solution here

        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();

        System.out.println(numOne + numTwo);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Before Swap:");
        // System.out.println("x: " + x);
        // System.out.println("y: " + y);

        x += y;
        y -= x;
        x += y;
        y *= -1;

        System.out.println("x: y: After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            //System.out.println("n1: " + n1);
            //System.out.println("n2: " + n2);
            System.out.println("n1: n2: n1 == n2");
        } else if (n1 > n2){
            //System.out.println("n1: " + n1);
            //System.out.println("n2: " + n2);
            System.out.println("n1: n2: n1 > n2");
        } else {
            //System.out.println("n1: " + n1);
            //System.out.println("n2: " + n2);
            System.out.println("n1: n2: n2 > n1");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        double revenue = scanner.nextDouble();
        System.out.print("Enter annual Revenue: ");

        if (0 <= revenue && revenue < 20_000)
            System.out.println("Poor Sales Revenue");
        else if (20_000 <= revenue && revenue < 50_000)
            System.out.println("Average Sales Revenue");
        else if (50_000 <= revenue && revenue < 80_000)
            System.out.println("Good Sales Revenue");
        else if (80_000 <= revenue && revenue < 100_000)
            System.out.println("Excellent Sales Revenue");
        else
            System.out.println("Invalid Revenue");


    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        int eingabe = scanner.nextInt();
        System.out.print("Enter CommissionClass: ");

        switch (eingabe) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        int yearNum = scanner.nextInt();
        System.out.print("Year: ");

        if (yearNum % 400 == 0)
            System.out.println("Leapyear");
        else if (yearNum % 100 == 0)
            System.out.println("Not a Leapyear");
        else if (yearNum % 4 == 0)
            System.out.println("Leapyear");
        else
            System.out.println("Not a Leapyear");

    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        int num = scanner.nextInt();
        int len = String.valueOf(num).length();
        int rem;
        System.out.print("Number: ");

        for (int i = 0; i < len; i++) {
            if (len <= 3) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

        }

        System.out.println(rev);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}