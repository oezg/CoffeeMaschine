package machine;
import java.util.Scanner;


public class CoffeeMachine {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = initialize();
        boolean exit = true;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy":
                    buy(a);
                    break;
                case "fill":
                    fill(a);
                    break;
                case "take":
                    System.out.printf("I gave you $%d %n", a[4]);
                    a[4] = 0;
                    break;
                case "remaining":
                    remaining(a);
                    break;
                case "exit":
                    exit = false;
                    break;
                default:
                    break;
            }
        } while (exit);
    }
    static void theMethod(String input) {

    }
    static void buy(int[] a) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        switch (scanner.next()) {
            case "1":
                espresso(a);
                break;
            case "2":
                latte(a);
                break;
            case "3":
                cappuccino(a);
                break;
            case "back":
                break;
            default:
                break;
        }
    }
    static void fill(int[] a) {
        System.out.println("Write how many ml of water do you want to add: ");
        a[0] += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        a[1] += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        a[2] += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        a[3] += scanner.nextInt();
    }
    static void espresso(int[] a) {
        if (a[0] >= 250 && a[2] >= 16 && a[3] >=1) {
            a[0] -= 250;
            a[2] -= 16;
            a[3] -= 1;
            a[4] += 4;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (a[0] < 250) {
                System.out.println("Sorry, not enough water!");
            } else if (a[2] < 16) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (a[3] < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }
    static void latte(int[] a) {
        if (a[0] >= 350 && a[1] >= 75 && a[2] >= 20 && a[3] >=1) {
            a[0] -= 350;
            a[1] -= 75;
            a[2] -= 20;
            a[3] -= 1;
            a[4] += 7;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (a[0] < 350) {
                System.out.println("Sorry, not enough water!");
            } else if (a[1] < 75) {
                System.out.println("Sorry, not enough milk!");
            } else if (a[2] < 16) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (a[3] < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }
    static void cappuccino(int[] a) {
        if (a[0] >= 200 && a[1] >= 100 && a[2] >= 12 && a[3] >=1) {
            a[0] -= 200;
            a[1] -= 100;
            a[2] -= 12;
            a[3] -= 1;
            a[4] += 6;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (a[0] < 200) {
                System.out.println("Sorry, not enough water!");
            } else if (a[1] < 100) {
                System.out.println("Sorry, not enough milk!");
            } else if (a[2] < 12) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (a[3] < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }
    static int[] initialize() {
        return new int[] {400, 540, 120, 9, 550};
    }
    static void remaining(int[] a) {
        System.out.println("The coffee machine has:");
        System.out.printf("%d of water%n", a[0]);
        System.out.printf("%d of milk%n", a[1]);
        System.out.printf("%d of coffee beans%n", a[2]);
        System.out.printf("%d of disposable cups%n", a[3]);
        System.out.printf("%d of money%n", a[4]);
    }
}