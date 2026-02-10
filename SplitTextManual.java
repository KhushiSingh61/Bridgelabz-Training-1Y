import java.util.Scanner;

public class SplitTextManual {
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
    public static String[] manualSplit(String text) {
        int len = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndex = new int[wordCount - 1];
        int k = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        int wordNo = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            int end = spaceIndex[i];
            words[wordNo++] = text.substring(start, end);
            start = end + 1;
        }
        words[wordNo] = text.substring(start);

        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] manualWords = manualSplit(text);
        String[] builtinWords = text.split(" ");
        boolean result = compareArrays(manualWords, builtinWords);
        System.out.println("\nWords using manual method:");
        for (String w : manualWords) {
            System.out.println(w);
        }

        System.out.println("\nWords using split() method:");
        for (String w : builtinWords) {
            System.out.println(w);
        }
        System.out.println("\nAre both results same? " + result);
    }
}
