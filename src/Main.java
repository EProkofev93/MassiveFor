public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0, j = numbers.length - 1; i < numbers.length; i+=2, j-=2) {
            numbers[i] = i - 100;
            numbers[j] = numbers[i];
            numbers[i] = i + 1;
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
