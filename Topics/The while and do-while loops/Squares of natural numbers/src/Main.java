import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int cont = 1;

        while (cont <= n){
            double sroot = Math.sqrt(cont);
            if (cont % sroot == 0){
                System.out.println(cont);
            }
            cont++;
        }
    }
}