public class FirstTask {
    public static void main(String[] args) {
        convertNumber(15);
    }
    public static String convertNumber(int number) {
        String result = (number > 0) ? (number % 7 < 4 ? "positive-m" : "positive-p") : (number == 0 ? "zero" : number % 7 > -4 ? "negative-m" : "negative-p");
        System.out.println(result);
        return result;
    }
}
