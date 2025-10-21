package Algorithm;

public class Symbol {
    public static boolean task(String input) {
        int openCounter = 0;
        int closeCounter = 0;
        char[] openBracket = {'(', '[', '{'};
        char[] closeBracket = {')', ']', '}'};

        for (int count = 0; count < input.length(); count++) {
            char ch = input.charAt(count);

            for (int counter = 0; counter < openBracket.length; counter++) {
                if (ch  == openBracket[counter]) {
                    openCounter++;

                }
            }
            for (int counter = 0; counter < closeBracket.length; counter++) {
                if (ch == closeBracket[counter]) {
                    closeCounter++;
                }
            }
        }
        if (openCounter == closeCounter) {
            return true;
        }
        return false;
    }
    }