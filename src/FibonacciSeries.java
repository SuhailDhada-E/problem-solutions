public class FibonacciSeries {
//    1) Fibonacci series till 100
    public static void fibonacciSeriesTillHundred() {
        int first = 0, second = 1;
        System.out.print(first + " ");
        while (second < 100) {
            System.out.print(second + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
//    Fibonacci series for first 10 numbers
    public static void fibonacciSeriesFirstTenNumbers() {
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < 10; i++) {
            int temp = first + second;
            first = second;
            second = temp;
            System.out.print(second + " ");
        }
    }

    public static void main(String[] args) {
        fibonacciSeriesTillHundred();
        System.out.println();
        fibonacciSeriesFirstTenNumbers();
    }
}
