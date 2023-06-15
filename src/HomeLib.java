public class HomeLib {
    public void printTest1() {
        System.out.println("You are setup correctly if you see this.");
    }

    public int getSumOf(int a, int b) {
        return a + b;
    }

    public boolean checkIfStringIsPalindrome(String str) {
        String initialString = str.toLowerCase();
        StringBuilder sb = new StringBuilder(initialString);
        String reversedString = sb.reverse().toString();
        if (initialString.equals(reversedString)) {
            return true;
        } else {
            return false;
        }
    }
}