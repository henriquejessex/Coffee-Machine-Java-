package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffe machine has: ");
        int waterMachine = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkMachine = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeMachine = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int newCups = scanner.nextInt();

        int totalWater = waterMachine / 200;
        int totalMilk = milkMachine / 50;
        int totalCoffee = coffeeMachine / 15;

        int possibleCoffee = Math.min(totalWater, Math.min(totalCoffee, totalMilk));

        if (possibleCoffee == newCups){
            System.out.println("Yes, I can make that amount of coffee");
        } else if (possibleCoffee > newCups) {
            int additionalCups = possibleCoffee - newCups;
            System.out.println("Yes, I can make that amount of coffee (and even " + additionalCups + " more than that)");
        }else {
            System.out.println("No, I can make only " + possibleCoffee + " cup(s) of coffee");
        }
    }
}
