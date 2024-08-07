import java.util.*;

public class StringProblems {
    //    10) Program to find whether given 2 Strings are anagrams or not
    //            (Ex: (a) input1="silent", input2="listen" output :"both are anagrams"
    //            (b) input1="silent", input2="simple" output :"both are not anagrams")
    public static void isAnagram(String inputWord1, String inputWord2) {
        if (inputWord1.length() != inputWord2.length()) {
            System.out.println("Not an anagram");
            return;
        }

        inputWord1 = inputWord1.toLowerCase();
        inputWord2 = inputWord2.toLowerCase();

        char[] inputLetters1 = inputWord1.toCharArray();
        char[] inputLetters2 = inputWord2.toCharArray();

        Arrays.sort(inputLetters1);
        Arrays.sort(inputLetters2);

        boolean isAnagram = true;

        for (int i = 0; i < inputLetters1.length; i++) {
            if (inputLetters1[i] != inputLetters2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Both words are anagram");
        } else {
            System.out.println("Both words are not anagram");
        }
    }

    //   9) program to check whether given String is Palindrome or not
    //            (Ex: (a) input = "malayalam" output : Palindrome
    //            (b) input = "malayam" output : not Palindrome)

    public static void isPalindrome(String word) {
        int n = word.length();

        int i = 0, j = n - 1;

        boolean isPalindrome = true;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++; j--;
        }
        if (isPalindrome) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
    }

    //    11) program to find all possible words for a given String
    public static void findAllWords(String word) {
        generateAllWords(word, "");
    }

    private static void generateAllWords(String remaining, String ans) {
        if (remaining.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            char c = remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generateAllWords(newRemaining, ans + c);
        }
    }
//    12) program to remove duplicates in a given String?
    public static void removeDuplicates(String word) {
        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            characters.add(word.charAt(i));
        }
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (characters.contains(c)) {
                ans.append(c);
                characters.remove(c);
            }
        }
        System.out.println(ans.toString());
    }

    //13) program to count duplicate letters in a given String?

    public static void countDuplicateLetters(String word) {
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        long ans = freq
                .values()
                .stream()
                .filter(letterFrequency -> letterFrequency > 1)
                .count();
        System.out.println(ans);

    }

    public static void main(String[] args) {
        //10
        isAnagram("silent", "listen");

        //9
        isPalindrome("malayalam");
        isPalindrome("malayal");

        //12
        removeDuplicates("abaccdde");

        //13
        countDuplicateLetters("abaccdde");

    }
}
