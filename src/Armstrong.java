public class Armstrong {
//    3) Armstrong number (153 = (1*1*1 + 5*5*5 + 3*3*3)
    public static boolean isArmstrong(int n) {
        int temp = n;
        int power = String.valueOf(n).length();
        int sum = 0;
        while (temp != 0) {
            int reminder = temp % 10;
            sum += (int) Math.pow(reminder, power);
            temp /= 10;
        }
        return sum == n;
    }
    // 4) Program to print Armstrong number between 1 and 1000
    public static void findArmstrongNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i))  {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(120));
        findArmstrongNumbersInRange(1, 10);
    }
}
