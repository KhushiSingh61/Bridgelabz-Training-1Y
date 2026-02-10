import java.util.Scanner;

public class CharacterArrayCheck {
    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] userChars = getCharacters(text);
        char[] builtInChars = text.toCharArray();
        boolean isSame = compareArrays(userChars, builtInChars);
        System.out.print("Characters using user-defined method: ");
        for (char ch : userChars) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.print("Characters using toCharArray(): ");
        for (char ch : builtInChars) {
            System.out.print(ch + " ");
        }

        System.out.println();
        if (isSame) {
            System.out.println("Both character arrays are equal.");
        } else {
            System.out.println("Both character arrays are not equal.");
        }
    }
}
