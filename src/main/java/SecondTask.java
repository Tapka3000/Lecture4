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
        if (quantity >= 0 && quantity <= 100) {
            if (quantity == 0 || quantity > 4 && quantity < 20) {
                System.out.println(name + " хранит " + quantity + " яблок");
            } else if (quantity % 10 > 1 && quantity % 10 < 5) {
                System.out.println(name + " хранит " + quantity + " яблока");
            } else {
                System.out.println(name + " хранит " + quantity + " яблоко");
            }
        } else {
            System.out.println("Введите число от 0 до 100");
        }
    }
}
