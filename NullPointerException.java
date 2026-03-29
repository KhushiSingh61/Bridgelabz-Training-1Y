public class NullPointerException {
    public static void generateException() {
        String text = null;
        System.out.println("Length of string: " + text.length());
    }
    public static void handleExceptionSafely() {
        String text = null;

        if (text != null) {
            System.out.println("Length of string: " + text.length());
        } else {
            System.out.println("String is null. Cannot access methods on it.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method that generates NullPointerException:");
        generateException(); 
        System.out.println("Calling safe method:");
        handleExceptionSafely();
    }
}
