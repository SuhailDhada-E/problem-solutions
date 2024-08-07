public class SwapTwoNumbers {
//    6) swap 2 arrays without using third variables
    public static void main(String[] args) {
        int first = 10, second = 5;

        System.out.println("Before swap: " + first + " " + second);

        second = first + second;
        first = second - first;
        second = second - first;

        System.out.println("After swap: " + first + " " + second);
    }
}
