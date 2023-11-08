import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите имя ");
        String name = n.nextLine();

        System.out.println("Введите количество яблок ");
        int quantity = n.nextInt();

        quantityAndName(name, quantity);
    }
    public static void quantityAndName(String name, int quantity) {
        List<Integer> ending = Arrays.asList(11,12,13,14);
        if (quantity >= 0 && quantity <= 100) {
            if (quantity % 10 == 1 && !ending.contains(quantity)) {
                System.out.println(name + " хранит " + quantity + " яблоко");
            } else if (quantity % 10 > 1 && quantity % 10 < 5 && !ending.contains(quantity)) {
                System.out.println(name + " хранит " + quantity + " яблока");
            } else {
                System.out.println(name + " хранит " + quantity + " яблок");
            }
        } else {
            System.out.println("Введите число от 0 до 100");
        }
    }
}
