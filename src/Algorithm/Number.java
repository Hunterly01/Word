package Algorithm;

public class Number {
    public static int[] numbers(int [] arr, int num) {
        int[] newArray = new int[2];
        for (int counter = 0; counter < arr.length; counter++) {
            for (int count = 0; count < arr.length; count++) {
            if (arr[counter] + arr[count] == num) {
                newArray[count] = arr[count];
            }
        }
    }
        return newArray;
    }

}
