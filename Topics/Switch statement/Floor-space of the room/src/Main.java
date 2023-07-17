import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String geo = scanner.nextLine();


        switch (geo){

            case "triangle":
                double t1 = scanner.nextDouble();
                double t2 = scanner.nextDouble();
                double t3 = scanner.nextDouble();

                double semiPer = (t1 + t2 + t3) / 2;
                double area = Math.sqrt(semiPer * (semiPer - t1) * (semiPer - t2) * (semiPer - t3));

                System.out.println(area);

                break;

            case "rectangle":
                double r1 = scanner.nextDouble();
                double r2 = scanner.nextDouble();

                System.out.println(r1 * r2);
                break;

            case "circle":
                double c1 = scanner.nextDouble();
                double raio = 3.14 * Math.pow(c1, 2);
                System.out.println(raio);
                break;
        }

    }
}