import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int bigger = scanner.nextInt();
        int input = 1;
        do {
            input = scanner.nextInt();
            if (input > bigger){
                bigger = input;
            }
        } while (input != 0);

        System.out.println(bigger);
    }
}