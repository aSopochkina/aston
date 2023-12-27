import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstAlgorithm();
        secondAlgorithm();
        thirdAlgorithm();
    }

    public static void firstAlgorithm() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 7) {
            System.out.println("Привет");
        }
    }

    public static void secondAlgorithm() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input == null) {
            return;
        }
        if (input.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void thirdAlgorithm() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("")) {
            return;
        }
        String[] numbers = input.split(" ");
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = Integer.parseInt(numbers[i]);
        }
        for (int j : result) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }
}
