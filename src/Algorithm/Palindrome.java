package Algorithm;

public class Palindrome {
    public static boolean[] palindrome(String[] input) {
        boolean[] newArray = new boolean[input.length];
        for (int count = 0; count < input.length; count++) {
            String str = input[count];
            String reversed = "";

            for (int couter = str.length() - 1; couter >= 0; couter--) {
                reversed += str.charAt(couter);
            }
                if (input[count].equalsIgnoreCase(reversed)) {
                    newArray[count] = true;

                } else {
                    newArray[count] = false;
                }

            }
        return newArray;
    }

}
