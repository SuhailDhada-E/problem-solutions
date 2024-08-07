//7) Print given number in words (input =135 output = one hundred thirty five)
public class PrintNumberInWordFormat {

    public static String numberToEnglish(int num) {
        if (num == 0) {
            return "Zero";
        }

        String[] ones = {"", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] thousands = {"", "Thousand", "Million", "Billion"};

        StringBuilder ans = new StringBuilder();
        int ptr = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                StringBuilder temp = new StringBuilder();
                int rem = num % 1000;

                if (rem >= 100) {
                    temp.append(ones[rem / 100]).append(" Hundred ");
                    rem %= 100;
                }

                if (rem >= 20) {
                    temp.append(tens[rem / 10]).append(" ");
                    rem %= 10;
                }

                if (rem > 0) {
                    temp.append(ones[rem]).append(" ");
                }

                temp.append(thousands[ptr]).append(" ");
                ans.insert(0, temp);
            }
            num /= 1000;
            ptr++;
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(numberToEnglish(1000));
    }
}
