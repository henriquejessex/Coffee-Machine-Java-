import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        //int num = scanner.nextInt();
        while (true){
            int num = scanner.nextInt();
            if (num == 0){break;}
            if (num % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}